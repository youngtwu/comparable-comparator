package com.github.youngtwu.comparablecomparator.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Auther: wuyantao
 * @Date: 2018/11/6 16:56
 * @Description:
 */
public class ComparatorDemo1 {

    public static void main(String[] args) {
        Person[] persons = new Person[]{new Person("a", 11), new Person("b", 12), new Person("c", 10)};
        for (Person person : persons) {
            System.out.println(person.toString());
        }
        Collections.sort(Arrays.asList(persons), new ComparatorTest());
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        Collections.sort(Arrays.asList(persons), new ComparatorTest2());
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}


class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class ComparatorTest implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return new Integer(o1.age).compareTo(o2.age);
    }
}

class ComparatorTest2 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}