package com.yibo.jdk8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author: huangyibo
 * @Date: 2019/2/28 16:47
 * @Description:
 */
public class MethodReferenceTest2 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",80);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",70);
        Student student4 = new Student("zhaoliu",60);

        List<Student> list = Arrays.asList(student1,student2,student3,student4);

        list.sort((studentParam1,studentParam2) -> Student.compareStudentBySocre(studentParam1,studentParam2));
        list.sort((studentParam1,studentParam2) -> Student.compareStudentByName(studentParam1,studentParam2));
        System.out.println(list);

        list.sort(Student::compareStudentBySocre);
        list.sort(Student::compareStudentByName);
        System.out.println(list);

        StudentComparator studentComparator = new StudentComparator();
        list.sort((studentParam1,studentParam2) -> studentComparator.compareStudentBySocre(studentParam1,studentParam2));
        list.sort((studentParam1,studentParam2) -> studentComparator.compareStudentByName(studentParam1,studentParam2));
        list.sort(studentComparator::compareStudentBySocre);
        list.sort(studentComparator::compareStudentByName);


        list.sort(Student::compareBySocre);
        list.sort(Student::compareByName);

        List<String> citys = Arrays.asList("shenzhen","shanghai","beijing","chongqing");
        Collections.sort(citys,String::compareTo);

        MethodReferenceTest2 methodReferenceTest2 = new MethodReferenceTest2();
        String test2String = methodReferenceTest2.getString(Student::new);
        String string2 = methodReferenceTest2.getString2("  hello  ", String::new);

    }

    public <T> String getString(Supplier<T> supplier){
        return supplier.get() + "test";
    }

    public <T> T getString2(T str, Function<T,T> function){
        return function.apply(str);
    }
}
