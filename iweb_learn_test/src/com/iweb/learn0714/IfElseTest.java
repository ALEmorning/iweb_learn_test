package com.iweb.learn0714;
/*
*
* 逻辑测试  if  测试
* @time   2023.7.14
 */
import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入密码：");
//        String pwd = scan.next();
//
//        if("12345".equals(pwd)){
//            System.out.println("right");
//        }else {
//            System.out.println("wrong");
//        }
//
//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("性别：");
//        int gender = scan1.nextInt();
//        /*
//        * 在一组连贯的  if  else  语句中只会运行其中一个逻辑
//         */
//        if ( 1==gender ){
//            System.out.println("女");
//        }else if(2==gender){
//            System.out.println("男");
//        }else {
//            System.out.println("未知");
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("输入手机号");
        String phone = scan.next();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("输入密码：");
        String pwd = scan1.next();

        if("123456".equals(phone)/*判定条件*/){
            //代码块
            if("12345".equals(pwd)){
                System.out.println("登录成功。");
            }
            System.out.println("密码错误");
        }else {
            System.out.println("号码错误");
        }

        //加入取反：如果手机号不正确，终止业务
//        if(!("123456".equals(phone))){
//            System.out.println("错误");
//            return;
//        }
//        System.out.println("成功");



    }
}