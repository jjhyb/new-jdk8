package com.yibo.jdk8.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author: huangyibo
 * @Date: 2019/2/27 20:33
 * @Description:
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        Integer compute = compute(3, 5, (value1, value2) -> value1 + value2);
        System.out.println(compute);

        String min1 = getShortMin("hello", "world", (value1, value2) -> value1.compareTo(value2));
        System.out.println(min1);
        String min2 = getShortMin("hello", "world", (value1, value2) -> value1.charAt(0) - value2.charAt(0));
        System.out.println(min2);

        String max = getShortMax("hello", "world", (value1, value2) -> value1.charAt(0) - value2.charAt(0));
        System.out.println(max);

    }

    public static <T> T compute(T a, T b, BinaryOperator<T> binaryOperator){
        return binaryOperator.apply(a,b);
    }

    /**
     * 返回两个数的较小值
     * @param a
     * @param b
     * @param comparator
     * @param <T>
     * @return
     */
    public static <T> T getShortMin(T a, T b, Comparator<T> comparator){
        return BinaryOperator.minBy(comparator).apply(a,b);
    }

    /**
     * 返回两个数的较大值
     * @param a
     * @param b
     * @param comparator
     * @param <T>
     * @return
     */
    public static <T> T getShortMax(T a, T b, Comparator<T> comparator){
        return BinaryOperator.maxBy(comparator).apply(a,b);
    }
}
