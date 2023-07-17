package com.iweb.learn0717;

public class Person {
    public String name;
    public String id;
    public int age;
    public int gender;

    //构造方法
//    public Person(String name,String id){
//        this.name = name;
//        this.id = id;
//    }
    //构造方法可以有多个,以满足不同人的需求
    public Person(String name,int age,int gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }


}
