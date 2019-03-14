package com.yibo.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2019/2/28 19:29
 * @Description:
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Integer sum = list.stream().map(item -> item * 2).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
