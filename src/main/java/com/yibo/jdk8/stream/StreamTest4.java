package com.yibo.jdk8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: huangyibo
 * @Date: 2019/2/28 22:37
 * @Description:
 */
public class StreamTest4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","hello world");

        String[] array = stream.toArray(length -> new String[length]);
        Arrays.asList(array).forEach(System.out::println);

        String[] arrayString = stream.toArray(String[]::new);
        Arrays.asList(arrayString).forEach(System.out::println);

        Stream<String> stream1 = Stream.of("hello","world","hello world");
        List<String> list = stream1.collect(Collectors.toList());
        list.forEach(System.out::println);

        //下面这行代码是stream1.collect(Collectors.toList())的最底层实现
        ArrayList<String> arrayList = stream1.collect(() -> new ArrayList<String>(), (thenList, item) -> thenList.add(item),
                (thenList1, thenList2) -> thenList1.addAll(thenList2));

        //上面那行代码可以用方法引用替换成下面这行代码
        ArrayList<Object> arrayList1 = stream1.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        arrayList.forEach(System.out::println);
        arrayList1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("hello","world","hello world");
        LinkedList<String> linkedList = stream2.collect(Collectors.toCollection(LinkedList::new));
        linkedList.forEach(System.out::println);

        TreeSet<String> treeSet = stream2.collect(Collectors.toCollection(TreeSet::new));
        treeSet.forEach(System.out::println);

        String listString = stream2.collect(Collectors.joining()).toString();
        System.out.println(listString);

    }
}
