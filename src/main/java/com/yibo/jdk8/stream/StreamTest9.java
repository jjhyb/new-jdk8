package com.yibo.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2019/3/1 21:22
 * @Description:
 */
public class StreamTest9 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");

        //找出集合中长度为5的字符串，且将第一个打印出来
        list.stream().mapToInt(item -> item.length()).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
        list.stream().filter(item -> item.length() == 5).findFirst().ifPresent(System.out::println);


        //找出集合中长度为5的字符串，将字符串和其长度都打印出来
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
    }
}
