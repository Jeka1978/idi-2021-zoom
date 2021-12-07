package com.idi.idi2021zoom.my_spring;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ApplicationContext {

    private Map<Class<?>, Object> singletonContainer = new HashMap<>();

    private ObjectFactory objectFactory;

    private Config config;

    @Getter
    private Environment environment;


    public ApplicationContext(Config config) {
        this.config = config;
        environment = new Environment();
        objectFactory = new ObjectFactory(this);

    /*    Set<Class> classes =scanner.scanPackagesAndLookForComponents(config.getPackageToScan())
        for (Class aClass : classes) {
            singletonContainer.put(aClass, objectFactory.createObject(aClass));
        }*/
    }

    protected Config getConfig() {
        return config;
    }

    public <T> T getObject(Class<T> type) {
        Object t = singletonContainer.get(type);
        if (t != null) {
            return (T) t;
        }
        return objectFactory.createObject(type);


    }

}
