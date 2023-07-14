package com.iweb.learn;

/*
*
* 测试java符号
*
* @author luck
* @since  2023-7-13
* @version 1.0
*
 */


public class CodeTest {
    public void test(){
//        int i = 10 + (2 * 3);
//        System.out.println(i);
//
//        short s = (short) (i * 2);
//        System.out.println(s);

        int[] x;//数组
        int a = 12; // 二进制表示为 1100
        int b = 6;  // 二进制表示为 0110

        System.out.println(a);
        System.out.println(b);

        int resultAnd = a & b; // 位与运算
        System.out.println(Integer.toBinaryString(resultAnd)); // 输出：4

        int resultOr = a | b;   // 位或运算
        System.out.println(resultOr);  // 输出：14



    }

    public static void main(String[] args){
        CodeTest ct = new CodeTest();
        ct.test();
    }
}
