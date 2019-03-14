package com.yibo.jdk8.stream;

import java.util.stream.IntStream;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/28 19:23
 * @Description:
 */
public class StreamTest2 {

    public static void main(String[] args) {
        IntStream.of(new int[]{5,6,7,}).forEach(System.out::println);

        IntStream.range(3,8).forEach(System.out::println);

        IntStream.rangeClosed(3,8).forEach(System.out::println);
    }
}
