package com.yibo.jdk8.function;

import java.util.function.Predicate;

/**
 * @author: huangyibo
 * @Date: 2019/2/27 19:09
 * @Description:
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;
        boolean test = predicate.test("hello");
        System.out.println(test);
    }
}
