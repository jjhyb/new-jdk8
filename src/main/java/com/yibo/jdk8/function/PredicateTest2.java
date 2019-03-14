package com.yibo.jdk8.function;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author: huangyibo
 * @Date: 2019/2/27 19:29
 * @Description:
 */
public class PredicateTest2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        conditionFilter(list,item -> item % 2 == 0);

        conditionFilter(list,item -> item > 5);

        conditionFilter(list,item -> true);

        //找出集合中所有大于5且为偶数的元素
        conditionFilter2(list,item -> item > 5,item -> item % 2 == 0);

        //找出集合中大于5或为偶数的元素
        conditionFilter3(list,item -> item > 5,item -> item % 2 == 0);

        //找出集合中所有大于5且为偶数的元素基础上取反
        conditionFilter4(list,item -> item > 5,item -> item % 2 == 0);

        boolean test1 = isEqual("hello").test("hello");
        System.out.println(test1);

        boolean test2 = isEqual(new Date()).test(new Date());
        System.out.println(test2);

    }

    public static <T> void conditionFilter(List<T> list, Predicate<T> predicate){
        list.forEach(t -> {
            if(predicate.test(t)){
                System.out.println(t);
            }
        });
    }

    public static <T> void conditionFilter2(List<T> list,Predicate<T> predicate1,Predicate<T> predicate2){
        list.forEach(item -> {
            if(predicate1.and(predicate2).test(item)){
                System.out.println(item);
            }
        });
    }

    public static <T> void conditionFilter3(List<T> list,Predicate<T> predicate1,Predicate<T> predicate2){
        list.forEach(item -> {
            if(predicate1.or(predicate2).test(item)){
                System.out.println(item);
            }
        });
    }

    public static <T> void conditionFilter4(List<T> list,Predicate<T> predicate1,Predicate<T> predicate2){
        list.forEach(item -> {
            if(predicate1.and(predicate2).negate().test(item)){
                System.out.println(item);
            }
        });
    }

    public static <T> Predicate<T> isEqual(T t){
        return Predicate.isEqual(t);
    }

}
