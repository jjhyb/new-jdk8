package com.yibo.jdk8.optional;

import java.util.Optional;

/**
 * @author: huangyibo
 * @Date: 2019/2/28 15:33
 * @Description:
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        if(optional.isPresent()){
            System.out.println(optional.get());
        }

        //Optional推荐使用下面这种函数式编程风格
        optional.ifPresent(item -> System.out.println(item));

        System.out.println(optional.orElse("world"));

        System.out.println(optional.orElseGet(() -> "nihao"));
    }
}
