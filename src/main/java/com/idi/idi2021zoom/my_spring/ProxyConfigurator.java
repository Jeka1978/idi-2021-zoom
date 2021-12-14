package com.idi.idi2021zoom.my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurator {
    Object wrapWithProxyIfNeeded(Object t, Class<?> type);
}
