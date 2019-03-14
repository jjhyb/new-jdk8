package com.yibo.jdk8.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author: huangyibo
 * @Date: 2019/2/27 16:57
 * @Description:
 */
public class FunctionTest2 {

    public static void main(String[] args) {
        FunctionTest2 test = new FunctionTest2();

        int compute = test.compute(2, value -> value * 3, value -> value * value);
        int compute2 = test.compute2(2, value -> value * 3, value -> value * value);
        System.out.println(compute);
        System.out.println(compute2);

        int compute3 = test.compute3(2, 3, (value1, value2) -> value1 + value2);
        System.out.println(compute3);

        int compute4 = test.compute4(3, 4, (value1, value2) -> value1 + value2, value -> value * value);
        System.out.println(compute4);
    }

    public <T> T compute(T a, Function<T,T> function1,Function<T,T> function2){
        return function1.compose(function2).apply(a);
    }

    public <T> T compute2(T a,Function<T,T> function1,Function<T,T> function2){
        return function1.andThen(function2).apply(a);
    }

    public <T> T compute3(T a, T b, BiFunction<T,T,T> function){
        return function.apply(a,b);
    }

    public <T> T compute4(T a,T b,BiFunction<T,T,T> biFunction,
                        Function<T,T> function){
        return biFunction.andThen(function).apply(a,b);
    }
}
