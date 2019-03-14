package com.yibo.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: wb-hyb441488
 * @Date: 2019/3/6 20:25
 * @Description:
 *
 * 分组：group by      分组 --> 可以根据条件分N个组
 * 分区：partition by  分区 --> 根据条件只能分为两个组，相当于true和false
 */
public class StreamTest12 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",90,20);
        Student student2 = new Student("lisi",80,20);
        Student student3 = new Student("wangwu",100,27);
        Student student4 = new Student("lisi",80,18);

        List<Student> list = Arrays.asList(student1,student2,student3,student4);

        //根据name对集合中的元素进行分组
        Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getName));
        map.forEach((key,value) -> System.out.println(key +" : " + value));

        //根据score对集合中的元素进行分组
        Map<Integer, List<Student>> map1 = list.stream().collect(Collectors.groupingBy(Student::getScore));
        map1.forEach((key,value) -> System.out.println(key +" : " + value));

        //根据name对集合中的元素进行分组，且计算出分组后的个数
        Map<String, Long> map2 = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        map2.forEach((key,value) -> System.out.println(key +" 组的人数为: " + value));

        //根据name对集合中的元素进行分组，且计算出分组后score的平均值
        Map<String, Double> map3 = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        map3.forEach((key,value) -> System.out.println(key +" 组的score平均值为: " + value));

        //根据score对集合进行分区，分为大于等于90和小于90的
        Map<Boolean, List<Student>> map4 = list.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));
        map4.forEach((key,value) -> {
            if(key){
                System.out.println("score大于等于90的学生为: " + value);
            }else{
                System.out.println("score小于90的学生为: " + value);
            }
        });
    }
}
