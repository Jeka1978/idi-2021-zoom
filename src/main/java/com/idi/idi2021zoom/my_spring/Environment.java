package com.idi.idi2021zoom.my_spring;

import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Environment {


    private Map<String, Object> properties = new HashMap<>();


    public Environment() {
        properties.put("mutation.name", "OXYMORON");
        //in the future it will not be hardcoded, but will be taken from environment variables, property files...
    }

    public Object getProperty(String name) {
        return properties.get(name);
    }
}
