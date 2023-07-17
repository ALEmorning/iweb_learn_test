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


    //加法 方法的重载
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
    //减法 方法
    public double subtract(int i, int j) {
        return subtract((double) i, (double) j);
    }

    public double subtract(double i, double j) {
        return i - j;
    }

    public double subtract(String i, String j) {
        return subtract(Double.parseDouble(i), Double.parseDouble(j));
    }

    public double subtract(float i, float j) {
        return subtract((double) i, (double) j);
    }

    //乘法  方法
    public double multiply(int i, int j) {
        return multiply((double) i, (double) j);
    }

    public double multiply(double i, double j) {
        return i * j;
    }

    public double multiply(String i, String j) {
        return multiply(Double.parseDouble(i), Double.parseDouble(j));
    }

    public double multiply(float i, float j) {
        return multiply((double) i, (double) j);
    }

    //除法  方法
    public double divide(int i, int j) {
        return divide((double) i, (double) j);
    }

    public double divide(double i, double j) {
        return i / j;
    }

    public double divide(String i, String j) {
        return divide(Double.parseDouble(i), Double.parseDouble(j));
    }

    public double divide(float i, float j) {
        return divide((double) i, (double) j);
    }

}
