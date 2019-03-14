package com.yibo.jdk8.domain;

import java.util.List;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/28 15:53
 * @Description:
 */
public class Company {

    private String username;

    private List<Employee> employees;

    public String getUsername() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
