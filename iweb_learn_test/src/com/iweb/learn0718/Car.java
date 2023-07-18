package com.iweb.learn0718;

import java.util.Scanner;

public class Car {
    public String brand;

    public String drive(String name){
        System.out.println("请输入反馈：");
        return new Scanner(System.in).next();//返回值可以是用户输入的内容
    }
}
