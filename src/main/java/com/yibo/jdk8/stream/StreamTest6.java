package com.yibo.jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * @author: huangyibo
 * @Date: 2019/3/1 16:24
 * @Description:
 */
public class StreamTest6 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//        System.out.println(stream.findFirst().get());
        stream.findFirst().ifPresent(System.out::println);//这句代码才符合函数式编程风格

        String str = Stream.generate(UUID.randomUUID()::toString).findFirst().get();
        System.out.println(str);

        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);

        /**
         * Stream.iterate(1, item -> item + 2).limit(6)
         * 找出该流中大于2的元素，然后将每个元素乘以2，然后忽略掉流中的前两个元素，然后在取流中的前两个元素，然后求出流中元素的总和
         */
        Integer sum1 = Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).map(item -> item * 2).skip(2).limit(2).reduce(0, Integer::sum);
        System.out.println(sum1);
        Integer sum2 = Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum();
        System.out.println(sum2);

        /**
         * Stream.iterate(1, item -> item + 2).limit(6)
         * 找出该流中大于2的元素，然后将每个元素乘以2，然后忽略掉流中的前两个元素，然后在取流中的前两个元素，然后求出流中最大的元素
         */
        int max = Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).max().getAsInt();
        System.out.println(max);

        Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).max().ifPresent(System.out::println);


        /**
         * Stream.iterate(1, item -> item + 2).limit(6)
         * 找出该流中大于2的元素，然后将每个元素乘以2，然后忽略掉流中的前两个元素，然后在取流中的前两个元素，然后求出流中最大值，最小值，平均值与和
         */
        IntSummaryStatistics intSummaryStatistics = Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getAverage());
    }
}
