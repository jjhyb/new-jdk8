package com.yibo.jdk8.defaultmethod;

/**
 * @author: huangyibo
 * @Date: 2019/2/28 18:42
 * @Description:
 */
public class MyClass implements MyInterface1,MyInterface2 {
    @Override
    public void method() {
        MyInterface2.super.method();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method();
    }
}
