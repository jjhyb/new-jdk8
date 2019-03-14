package com.yibo.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/28 16:25
 * @Description:
 */
public class MethodReferenceTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","helloworld");
        list.forEach(item -> System.out.println());

        list.forEach(System.out::println);
    }
}
