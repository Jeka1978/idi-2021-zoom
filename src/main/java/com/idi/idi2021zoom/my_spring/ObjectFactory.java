package com.idi.idi2021zoom.my_spring;

import lombok.SneakyThrows;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {

    private ApplicationContext context;
    private List<ObjectConfigurator> configurators = new ArrayList<>();

    public ObjectFactory(ApplicationContext context) {
        this.context = context;
        configurators.add(new InjectByTypeObjectConfigurator(context));
        configurators.add(new InjectFromEnvironmentObjectConfigurator(context.getEnvironment()));
    }



    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = context.getConfig().getImplClass(type);
        }
        T t = type.getDeclaredConstructor().newInstance();

        for (ObjectConfigurator configurator : configurators) {
            configurator.configure(t);
        }

        if (type.isAnnotationPresent(Profiling.class)) {
            return (T) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), type.getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                            System.out.println("******* profiling started for method: "+method.getName()+"  ******");
                            long start = System.nanoTime();
                            Object retVal = method.invoke(t, args);
                            long end = System.nanoTime();
                            System.out.println(end-start);
                            System.out.println("******* profiling ended for method: "+method.getName()+"  ******");

                            return retVal;
                        }
                    }

            );
        }

        return t;
    }
}
