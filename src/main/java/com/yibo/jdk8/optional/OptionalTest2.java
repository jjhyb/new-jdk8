package com.yibo.jdk8.optional;

import com.yibo.jdk8.domain.Company;
import com.yibo.jdk8.domain.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/28 15:54
 * @Description:
 */
public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee1 = new Employee();
        employee1.setName("list");

        Company company = new Company();
        company.setName("baidu");

        List<Employee> list = Arrays.asList(employee,employee1);
        company.setEmployees(list);

        Optional<Company> optional = Optional.ofNullable(company);

        List<Employee> employeeList = optional.map(thCompany -> thCompany.getEmployees()).orElse(Collections.emptyList());
        System.out.println(employeeList);
    }
}
