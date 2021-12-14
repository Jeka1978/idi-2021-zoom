package com.idi.idi2021zoom.my_spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Evgeny Borisov
 */
public class ProfilngProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object wrapWithProxyIfNeeded(Object t, Class<?> type)  {
        if (type.isAnnotationPresent(Profiling.class)) {
            return  Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), type.getInterfaces(),
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
        }else {
            return t;
        }
    }
}
