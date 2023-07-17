package com.iweb.learn0717;
/*
*
* 重载方法测试
* @author  luck
* @time    2023.7.17
 */
public class Calculator {
    public Calculator(){
        System.out.println("欢迎使用计算机。");
    }


    public double add(int i,int j){
        return add((double) i,(double) j);
    }

    public double add(double i,double j){
        return i+j;
    }
    public double add(String i,String j){
        return add(Double.parseDouble(i),Double.parseDouble(j));
    }
    public double add(float i,float j){
        return add((double) i,(double) j);
    }

}
