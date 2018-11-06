package com.github.youngtwu.comparablecomparator.comparable;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Auther: wuyantao
 * @Date: 2018/11/6 16:29
 * @Description: 比较集合顺序，默认从小到大
 */
public class ComparableDemo2 {

    public static void main(String[] args) {
        Person[] persons = new Person[]{new Person("张三", 15), new Person("李四", 14), new Person("王五", 13)};
        for(Person person : persons){
            System.out.println("排序前，name:"+person.name+", age:"+person.age);
        }
        Collections.sort(Arrays.asList(persons));
        for(Person person : persons){
            System.out.println("排序后，name:"+person.name+", age:"+person.age);
        }
    }
}

/**
 * 直接对象实现Comparable接口
 */
class Person implements Comparable<Person>{

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.valueOf(this.age).compareTo(o.age);
    }
}