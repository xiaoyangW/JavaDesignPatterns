package com.design.patterns.proxy;


import com.design.patterns.proxy.cglib.CglibProxy;
import com.design.patterns.proxy.jdk.ProxyFactory;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author WXY
 */
public class App {

    public static void main(String[] args) {

        IUserDao userDao = new UserImpl();
        //静态代理
        /*UserProxy userProxy = new UserProxy(userDao);
        userProxy.save();*/
        //jdk动态代理
        /*IUserDao user = (IUserDao) new ProxyFactory().getInstance(userDao);
        user.save();*/

        IUserDao proxyUserDao = (IUserDao)CglibProxy.getInstance(userDao);
        proxyUserDao.save();

    }

}