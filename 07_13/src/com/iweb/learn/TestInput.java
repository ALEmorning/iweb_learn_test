package com.iweb.learn;

import java.util.Scanner;

public class TestInput {
    public void test(){
        System.out.println("你叫啥？");
        Scanner scan=new Scanner(System.in);
        String name=scan.next();

        System.out.println("你多大");
        int age=scan.nextInt();

        System.out.println("你是男的女的（1、男的，2、女的）");
        char gender=scan.nextInt() == 1?'男':'女';

        System.out.println("So");
        System.out.println("你是"+name+"，你今年"+age+"岁，你是"+gender+"的。");

    }

    public static void main(String[] args){
        TestInput ti=new TestInput();
        ti.test();
    }
}
