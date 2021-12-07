package com.idi.idi2021zoom.my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectFromEnvironmentObjectConfigurator implements ObjectConfigurator {
    private Environment environment;

    public InjectFromEnvironmentObjectConfigurator(Environment environment) {
        this.environment = environment;
    }

    @Override

    @SneakyThrows
    public void configure(Object t) {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            InjectFromEnvironment annotation = field.getAnnotation(InjectFromEnvironment.class);
            if (annotation != null) {
                String propertyName = annotation.propertyName();
                Object value = environment.getProperty(propertyName);
                field.setAccessible(true);
                field.set(t, value);
            }
        }
    }
}
