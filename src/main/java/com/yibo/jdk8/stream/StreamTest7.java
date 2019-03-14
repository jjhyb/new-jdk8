package com.yibo.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author: huangyibo
 * @Date: 2019/3/1 17:34
 * @Description:
 */
public class StreamTest7 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");

        list.stream().map(item -> item.substring(0,1).toUpperCase()+item.substring(1)).forEach(System.out::println);


        //IntStream.iterate(0,item -> (item + 1) % 2).distinct().limit(6).distinct().forEach(System.out::println);
        //上面一行代码.distinct()的用法是错误的，因为distinct()在去重之前没有限定流中元素的个数

        IntStream.iterate(0,item -> (item + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}
