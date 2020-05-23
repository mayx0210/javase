package com.myx.object;

public class Parameter {
    public static void main(String[] args) {
//        char[] arr = new char[]{'1','b','c'};
//        System.out.println(arr);
        Person obj = new Person();
        obj.age = 5;
        System.out.println(obj.age);
        change(obj);
        System.out.println(obj.age);

    }

    private static void change(Person obj) {
        obj = new Person();
        System.out.println(obj.age);
        obj.age = 3;
        System.out.println(obj.age);
    }
}

class Person
{
    int age;
}