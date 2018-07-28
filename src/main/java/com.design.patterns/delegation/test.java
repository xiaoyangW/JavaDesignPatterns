package com.design.patterns.delegation;

/**
 * 委派模式
 * @author WXY
 * @date 2018/7/28 17:00
 */

public class test {

    public static void main(String[] args) {
        //new Manager(new EmployeeA()).jobs();
        new Manager(new EmployeeB()).jobs();
    }

}
