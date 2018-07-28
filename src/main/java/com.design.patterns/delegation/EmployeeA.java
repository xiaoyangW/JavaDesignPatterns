package com.design.patterns.delegation;

/**
 * @author WXY
 * @date 2018/7/28 16:54
 */

public class EmployeeA implements IEmployee{
    @Override
    public String jobs() {
        System.out.println("---------------由员工A完成--------------");
        return null;
    }
}
