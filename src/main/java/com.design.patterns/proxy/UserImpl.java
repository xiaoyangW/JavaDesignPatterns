package com.design.patterns.proxy;

/**
 * @author WXY
 * 接口实现--目标对象
 */
public class UserImpl implements IUserDao {

    @Override
    public void save() {
        System.out.println("------------------user save---------------");
    }
}
