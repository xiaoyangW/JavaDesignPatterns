package com.design.patterns.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理
 * @author WXY
 */
public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("-------------执行之前-----------"+method.getName());
        Object object = methodProxy.invokeSuper(o,objects);
        System.out.println("--------------执行之后-------"+method.getName());
        return null;
    }
}
