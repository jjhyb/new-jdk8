package com.yibo.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: wb-hyb441488
 * @Date: 2019/3/6 19:51
 * @Description:
 */
public class StreamTest11 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi","hello","你好");
        List<String> list2 = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");

        list1.stream().flatMap(item1 -> list2.stream().map(item2 -> item1 + " " + item2))
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
