package com.iweb.learn0714;

import javafx.scene.shape.TriangleMesh;

public class LoopTest {
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

    public static void main(String[] args){
        LoopTest t1 = new LoopTest();
        System.out.println("左下直角三角形");
        t1.TriangleTest1();
        System.out.println("------------------------");
        System.out.println("左上直角三角形");
        t1.TriangleTest2();
        System.out.println("------------------------");
        System.out.println("右下直角三角形");
        t1.TriangleTest3();
        System.out.println("------------------------");
        System.out.println("等腰三角形");
        t1.TriangleTest4();
        System.out.println("------------------------");
        System.out.println("菱形");
        t1.TriangleTest5();


    }
}
