package com.yibo.jdk8.defaultmethod;

/**
 * @author: huangyibo
 * @Date: 2019/2/28 18:41
 * @Description:
 */
public interface MyInterface1 {

    default void method(){
        System.out.println("MyInterface1");
    }
}
