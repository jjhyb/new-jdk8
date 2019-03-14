package com.yibo.jdk8.defaultmethod;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/28 18:41
 * @Description:
 */
public interface MyInterface1 {

    default void method(){
        System.out.println("MyInterface1");
    }
}
