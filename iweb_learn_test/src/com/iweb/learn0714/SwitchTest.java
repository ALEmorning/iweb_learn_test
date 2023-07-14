package com.iweb.learn0714;

import java.util.Scanner;

public class SwitchTest {

    public enum Color{//枚举，限定的名称
        YELLOW, RED, GREEN, ORANGE, BLUE;
    }

    public void showAge(int age){
        switch ( age ){

        }
    }

    public void test(Color c){
        switch ( c ){
            case RED:
                System.out.println("红色");
                break;
            case ORANGE:
                System.out.println("橙色");
                break;
            case YELLOW:
                System.out.println("黄色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args){
        SwitchTest t1 = new SwitchTest();
        Scanner scan = new Scanner(System.in);
        String ch = scan.next();
        t1.test(Color.valueOf(ch));
    }

}
