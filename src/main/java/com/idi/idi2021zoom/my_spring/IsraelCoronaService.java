package com.idi.idi2021zoom.my_spring;

/**
 * @author Evgeny Borisov
 */

@Profiling
public class IsraelCoronaService implements CoronaService {

    @InjectFromEnvironment(propertyName = "mutation.name")
    private String mutationName;

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
