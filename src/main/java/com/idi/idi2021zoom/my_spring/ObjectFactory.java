package com.idi.idi2021zoom.my_spring;

import lombok.SneakyThrows;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    private ApplicationContext context;
    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private List<ProxyConfigurator> proxyConfigurators = new ArrayList<>();

    public ObjectFactory(ApplicationContext context) {
        this.context = context;
        configurators.add(new InjectByTypeObjectConfigurator(context));
        configurators.add(new InjectFromEnvironmentObjectConfigurator(context.getEnvironment()));
        proxyConfigurators.add(new ProfilngProxyConfigurator());
    }




    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImpl(type);
        T t = create(type);

        configure(t);

        t = wrapWithProxy(type, t);


        return t;
    }

    private <T> T wrapWithProxy(Class<T> type, T t) {
        for (ProxyConfigurator proxyConfigurator : proxyConfigurators) {
            t = (T) proxyConfigurator.wrapWithProxyIfNeeded(t, type);
        }
        return t;
    }

    private <T> void configure(T t) {
        for (ObjectConfigurator configurator : configurators) {
            configurator.configure(t);
        }
    }

    private <T> T create(Class<T> type) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return type.getDeclaredConstructor().newInstance();
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            type = context.getConfig().getImplClass(type);
        }
        return type;
    }
}
