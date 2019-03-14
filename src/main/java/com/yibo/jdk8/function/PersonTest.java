package com.yibo.jdk8.function;

import com.yibo.jdk8.domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author: huangyibo
 * @Date: 2019/2/27 17:50
 * @Description:
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan",20);
        Person person2 = new Person("lisi",38);
        Person person3 = new Person("wangwu",40);
        List<Person> list = Arrays.asList(person1,person2,person3);

        List<Person> resultList = getPersonByUsername("zhangsan", list);
        resultList.forEach(person -> System.out.println(person));

        List<Person> personByAge = getPersonByAge(20, list);
        personByAge.forEach(person -> System.out.println(person));

        List<Person> personByAge2 = getPersonByAge2(20, list, (age, personList) ->
                personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList())
        );
        personByAge2.forEach(person -> System.out.println(person));
    }

    public static List<Person> getPersonByUsername(String username,List<Person> list){
        return list.stream().filter(person -> person.getName().equals(username)).collect(Collectors.toList());
    }

    public static List<Person> getPersonByAge(int age,List<Person> list){
        /*BiFunction<Integer,List<Person>,List<Person>> biFunction = (ageOfPerson,personList) -> {
            return personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        };*/
        //这里下面一行代码和上面注释掉的代码一个意思，只是写法更简洁
        BiFunction<Integer,List<Person>,List<Person>> biFunction = (ageOfPerson,personList) ->
            personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());

        return biFunction.apply(age,list);
    }

    public static <T> List<T> getPersonByAge2(int age,List<T> list,BiFunction<Integer,List<T>,List<T>> biFunction){
        return biFunction.apply(age,list);
    }
}
