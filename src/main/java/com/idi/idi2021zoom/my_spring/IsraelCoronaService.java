package com.idi.idi2021zoom.my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */

@Profiling
public class IsraelCoronaService implements CoronaService {

    @InjectFromEnvironment(propertyName = "mutation.name")
    private String mutationName;

    @PostConstruct
    public void init() {
        System.out.println("mutationName = " + mutationName);
    }

    @Override
    public double getTax() {
        return Math.random();
    }

    @Override
    public String getMutationName() {
        return mutationName;
    }
}
