package com.github.youngtwu.comparablecomparator.comparable;

/**
 * @Auther: wuyantao
 * @Date: 2018/11/6 15:52
 * @Description: java.lang.Comparable 比较对象属性
 */
public class ComparableDemo {

    public static void main(String[] args) {
        Person1 p1 = new Person1("abc", 15);
        Person1 p2 = new Person1("cba", 12);

        int result1 = p1.compareTo(p2);
        System.out.println("比较年龄，结果："+result1);

        Person2 p3 = new Person2("abc", 15);
        Person2 p4 = new Person2("cba", 12);

        int result2 = p3.compareTo(p4);//比较的是字符串的ASCII码值相差多少
        System.out.println("比较姓名，结果："+result2);
    }
}

/**
 * 直接对象实现Comparable接口
 */
class Person1 implements Comparable<Person1>{

    public String name;
    public int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person1 o) {
        return Integer.valueOf(this.age).compareTo(o.age);
    }
}

/**
 * 直接对象实现Comparable接口
 */
class Person2 implements Comparable<Person2>{

    public String name;
    public int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person2 o) {
        return this.name.compareTo(o.name);
    }
}