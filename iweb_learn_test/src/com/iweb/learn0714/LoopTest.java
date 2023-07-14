package com.iweb.learn0714;

import javafx.scene.shape.TriangleMesh;

import java.util.Random;
import java.util.Scanner;

public class LoopTest {
    //for 循环
    public void TriangleTest1(){//左下直角三角形
        int rows = 8; // 三角形的行数
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void TriangleTest2(){//左上直角三角形
        int rows = 8; // 三角形的行数
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void TriangleTest3(){//右下直角三角形
        int rows = 5; // 三角形的行数
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" "); // 打印空格
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*"); // 打印星号
            }
            System.out.println(); // 换行
        }
    }
    public void TriangleTest4(){//等腰
        int rows = 5; // 三角形的行数
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void TriangleTest5(){//菱形
        int rows = 5; // 菱形的行数

        for (int i = 0; i < rows; i++) {
            for (int j = rows - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = rows - 2; i >= 0; i--) {
            for (int j = rows - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void CreateA(int height) {
        int bottom = height * 2 + 1;

        for ( int i = 0; i <= height; i++ ) {
            for ( int j = 0; j < bottom; j++ ) {
                if ( j >= height - i && j <= height + i ) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < bottom; j++) {


                if(j >= 1 + i && j < bottom - 1 - i) {
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }
    public void CreateB(){

        Scanner scan = new Scanner(System.in);

        System.out.println("诶嘿，欢迎来的新手村！");
        System.out.println("你的名字：");
        String name = scan.next();

        System.out.println("准备开始！");
        int blood = 50;
        int act = 5;

        Random r = new Random();
        while ( true ){
            int m_b = r.nextInt(50);
            System.out.println("你遭遇了怪物 血量："+m_b);

            while ( true ){
                //对方出手
                int a = r.nextInt(5);
                blood -= a;//将血量减掉
                System.out.println("对方砍了你"+a+"点血，剩余血量："+blood);
                if ( blood <= 0 ){
                    System.out.println("你被怪物打死了！");
                    return;
                }
                m_b -= act;
                System.out.println("你砍了对方"+act+"点血，剩余血量："+m_b);
                if ( m_b<=0 ){
                    System.out.println("你杀死了怪物。");
                    break;
                }
            }
            System.out.println("继续前进吗？");
            String y = scan.next();

            if ( !("y".equals(y)) ) {
                System.out.println("你退出了。");
                return;
            }
        }
    }
    public void CreateC(){
        int base = new Random().nextInt(100);
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while ( true ){
            System.out.println("请猜一个0~100的数字");
            int guess = scan.nextInt();
            count++;
            if(guess == base){
                System.out.println("bingo,num is: "+base);
                System.out.println("time is: "+count);
                break;
            }else if ( guess < base ){
                System.out.println("sorry,smaller than base.");
            }else if ( guess > base ){
                System.out.println("sorry,bigger than base.");
            }
        }
    }
    public void CreateD(){
        do {
            System.out.println("Hello");
        }while ( false );
    }

    public static void main(String[] args){
        LoopTest t1 = new LoopTest();
//        System.out.println("左下直角三角形");
//        t1.TriangleTest1();
//        System.out.println("------------------------");
//        System.out.println("左上直角三角形");
//        t1.TriangleTest2();
//        System.out.println("------------------------");
//        System.out.println("右下直角三角形");
//        t1.TriangleTest3();
//        System.out.println("------------------------");
//        System.out.println("等腰三角形");
//        t1.TriangleTest4();
//        System.out.println("------------------------");
//        System.out.println("菱形");
//        t1.TriangleTest5();
//        System.out.println("------------------------");
//        t1.CreateA(8);
//        t1.CreateB();
        t1.CreateC();
    }
}
