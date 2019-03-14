package com.yibo.jdk8.function;

import java.util.function.Function;

/**
 * @author: huangyibo
 * @Date: 2019/2/27 16:16
 * @Description:
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        int compute1 = test.compute(1, value -> {return 2 * value;});
        System.out.println(compute1);

        int compute2 = test.compute(2, value -> 5 + value);
        System.out.println(compute2);

        int compute3 = test.compute(3, value -> value * value);
        System.out.println(compute3);

        String compute4 = test.convert(5,value -> String.valueOf(value + "helloworld"));
        System.out.println(compute4);

        Function<Integer,Integer> function = value -> value * 2;
        int compute5 = test.compute(4, function);
        System.out.println(compute5);

    }

    public <T> T compute(T a, Function<T,T> function){
        T result = function.apply(a);
        return result;
    }

    public String convert(int a,Function<Integer,String> function){
        String result = function.apply(a);
        return result;
    }
}
