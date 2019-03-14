package com.yibo.jdk8.function;

import com.yibo.jdk8.domain.Student;

import java.util.function.Supplier;

/**
 * @author: huangyibo
 * @Date: 2019/2/27 20:17
 * @Description:
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());

        Supplier<Student> supplier1 = () -> new Student("张三",20);
        System.out.println(supplier1.get().getName());

        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get().getName());
    }
}
