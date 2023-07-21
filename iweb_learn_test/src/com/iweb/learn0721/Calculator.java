package com.iweb.learn0721;

import java.util.Scanner;

public class Calculator {
    public void execute(){
        Scanner scan = new Scanner(System.in);
        System.out.println("n1:");
        double n1 = scan.nextDouble();
        System.out.println("n2:");
        double n2 = scan.nextDouble();
        double res = 0;

        System.out.println(" +  -  x   ÷");
        int ch = scan.nextInt();
        switch ( ch ){
            case 1:
                res = Calculator.add(n1,n2);//直接调用
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
        System.out.println(res);
    }
    public static Double add(double a, double b){//静态
        return a+b;
    }
    public static Double subtract(double a, double b){//静态
        return a+b;
    }
    public static Double multiply(double a, double b){//静态
        return a+b;
    }
    public static Double divide(double a, double b){//静态
        return a+b;
    }

    public static void main( String[] args ) {
        Calculator c = new Calculator();
        c.execute();
    }
}
