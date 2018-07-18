package com.design.patterns.proxy;


import com.design.patterns.proxy.cglib.CglibProxy;
import com.design.patterns.proxy.jdk.ProxyFactory;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author WXY
 */
public class App {

    public static void main(String[] args) {

        IUserDao userDao = new UserDao();
        //静态代理
        /*UserProxy userProxy = new UserProxy(userDao);
        userProxy.save();*/
        //jdk动态代理
        /*IUserDao user = (IUserDao) new ProxyFactory().getInstance(userDao);
        user.save();*/

        // 使用cglib代理
        Enhancer enhancer = new Enhancer();
        //继承代理类
        enhancer.setSuperclass(userDao.getClass());
        //设置回调
        enhancer.setCallback(new CglibProxy());
        IUserDao proxyUserDao = (IUserDao)enhancer.create();
        proxyUserDao.save();

    }

}