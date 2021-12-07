package com.idi.idi2021zoom.my_spring;

/**
 * @author Evgeny Borisov
 */
public interface Config {
    <T> Class<T> getImplClass(Class<T> type);

    String getPackageToScan();

}
