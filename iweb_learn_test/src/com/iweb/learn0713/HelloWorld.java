package com.iweb.learn0713;

public class HelloWorld {

    short s; //全局变量

    {
        //代码块
        int x=s++; //局部变量 需要赋值

        System.out.println(s);
        System.out.println(x);
    }

    public static void main(String[] args){
        HelloWorld helloWorld=new HelloWorld();


    }

}





