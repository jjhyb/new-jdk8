package com.yibo.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: huangyibo
 * @Date: 2019/2/28 19:19
 * @Description:
 */
public class StreamTest1 {

    public static void main(String[] args) {
        Stream stream1 = Stream.of("hello","world","hello world");

        String[] strArr = {"hello","world","hello world"};
        Stream stream2 = Stream.of(strArr);
        Stream<String> stream3 = Arrays.stream(strArr);

        List<String> list = Arrays.asList(strArr);
        Stream<String> stream4 = list.stream();
    }
}
