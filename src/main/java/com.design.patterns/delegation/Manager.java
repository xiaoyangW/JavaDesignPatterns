package com.design.patterns.delegation;

/**
 * 经理类
 * @author WXY
 * @date 2018/7/28 16:59
 */
public class Manager implements IEmployee{

    private IEmployee employee;

    public Manager(IEmployee employee) {
        this.employee = employee;
    }

    @Override
    public String jobs() {
        this.employee.jobs();
        return null;
    }
}
