package proxy.jdk;

import proxy.IUserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements InvocationHandler {

    private IUserDao userDao;

    public Object getInstance(IUserDao userDao){
        this.userDao = userDao;
        Class clazz = userDao.getClass();
        System.out.println("道理对象是"+clazz);
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-------------------------------");
        System.out.println("jdk动态代理");
        method.invoke(this.userDao,args);
        System.out.println("--------------------------------");
        return null;
    }
}
