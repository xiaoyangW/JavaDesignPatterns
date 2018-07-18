package com.design.patterns.proxy.cglib;

import com.design.patterns.proxy.IUserDao;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理
 * @author WXY
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * 获取代理对象
     * @param userDao 代理对象
     * @return 代理后对象
     */
    public static Object getInstance(IUserDao userDao){
        // 使用cglib代理
        Enhancer enhancer = new Enhancer();
        //继承代理类
        enhancer.setSuperclass(userDao.getClass());
        //设置回调
        enhancer.setCallback(new CglibProxy());
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("-------------执行之前-----------"+method.getName());
        Object object = methodProxy.invokeSuper(o,objects);
        System.out.println("--------------执行之后-------"+method.getName());
        return null;
    }
}
