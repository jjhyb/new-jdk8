package com.yibo.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: wb-hyb441488
 * @Date: 2019/3/1 21:39
 * @Description:
 */
public class StreamTest10 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello welcome","world hello","hello world hello","hello welcome");


        //找出此集合中所有的单词并且去重
        list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct()
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
