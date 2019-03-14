package com.yibo.jdk8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: huangyibo
 * @Date: 2019/3/7 20:10
 * @Description:
 */
public class StreamTest1 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",90);
        Student student2 = new Student("lisi",80);
        Student student3 = new Student("wangwu",100);
        Student student4 = new Student("zhaoliu",90);
        List<Student> list = Arrays.asList(student1,student2,student3,student4);

        System.out.println("count：" + list.stream().collect(Collectors.counting()));
        System.out.println("count：" + list.stream().count());
    }
}
