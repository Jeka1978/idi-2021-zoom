package com.idi.idi2021zoom.my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectByTypeObjectConfigurator implements ObjectConfigurator {

    private ApplicationContext context;

    public InjectByTypeObjectConfigurator(ApplicationContext applicationContext) {
        this.context = applicationContext;
    }

    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectFromContext.class)) {
                Object object = context.getObject(field.getType());
                field.setAccessible(true);
                field.set(t,object);
            }
        }
    }
}
