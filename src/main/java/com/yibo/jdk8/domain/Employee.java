package com.yibo.jdk8.domain;

/**
 * @author: huangyibo
 * @Date: 2019/2/28 15:52
 * @Description:
 */
public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
