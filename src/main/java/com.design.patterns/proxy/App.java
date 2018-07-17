package proxy;

import proxy.jdk.ProxyFactory;

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
        IUserDao user = (IUserDao) new ProxyFactory().getInstance(userDao);
        user.save();
    }

}