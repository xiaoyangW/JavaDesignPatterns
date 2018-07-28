package com.design.patterns.delegation;

/**
 * @author WXY
 * @date 2018/7/28 16:56
 */

public class EmployeeB implements IEmployee{
    @Override
    public String jobs() {
        System.out.println("---------------由员工B完成--------------");
        return null;
    }
}
