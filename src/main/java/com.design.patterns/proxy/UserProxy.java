package com.design.patterns.proxy;

/**
 * @author WXY
 * 代理对象--静态代理
 */
public class UserProxy implements IUserDao{

    private IUserDao userDao;

    public UserProxy(IUserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void save() {
        System.out.println("-------------start-----------");
        userDao.save();
        System.out.println("---------------end--------------");
    }
}
