package com.yibo.jdk8.function;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2019/2/27 15:49
 * @Description:
 */
public class StringComparator {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhangsan","wangwu","lisi","zhaoliu");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);

        Collections.sort(list,(o1,o2) -> {
            return o2.compareTo(o1);
        });
        System.out.println(list);

        //expression o2.compareTo(o1)
        //statement {return o2.compareTo(o1);}

        Collections.sort(list,(o1,o2) -> o2.compareTo(o1));
        System.out.println(list);

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }
}
