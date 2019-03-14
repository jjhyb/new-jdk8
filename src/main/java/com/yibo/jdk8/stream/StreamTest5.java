package com.yibo.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: huangyibo
 * @Date: 2019/3/1 15:49
 * @Description:
 */
public class StreamTest5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world","test");

        list.stream().map(item -> item.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        list1.stream().map(item -> item * item).collect(Collectors.toList()).forEach(System.out::println);

        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1,2),Arrays.asList(9,10),Arrays.asList(5,6,7,8));
        lists.stream().flatMap(thenList -> thenList.stream()).map(item -> item * item).forEach(System.out::println);
    }
}
