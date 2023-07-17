package com.iweb.learn0717;

import java.util.Scanner;

/*
*
* 前期教学回顾 -- 数组
* @time  2023.7.17
 */
public class Review {
    public static void main( String[] args ) {
        Review r = new Review();
        r.mainPage();

    }
    public void mainPage(){//功能主界面，供用户选择功能
        int option;
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎来到用户界面：");
        System.out.println("请选择功能：1、添加用户信息；2、查看所有用户信息；3、退出");
        option = scan.nextInt();
        switch ( option ){
            case 1:
                recordData();
                break;
            case 2:
                showData();
                break;
            case 3:
                System.out.println("谢谢使用，您已成功退出。");
                System.exit(0);
                return;
            default:
                System.out.println("请选择正确的功能。");
        }
    }
    Person[] ps = new Person[3];
    int idx = 0;

    public void recordData(){
        while ( true ){
            if ( idx == ps.length  ){//每次插入前，先对数组长度进行判定
                Person[] temp = new Person[ps.length * 2];//双倍扩充
                //把原先数组数据找回
                System.arraycopy(ps,0,temp,0,ps.length);
                ps = temp;//扩充数组
            }
            Scanner scan = new Scanner(System.in);

            System.out.print("请输入用户姓名：\t");
            String name = scan.next();

            // System.out.println();
            System.out.print("请输入用户年龄：\t");
            int age = scan.nextInt();

            //System.out.println();
            System.out.print("请输入用户性别（1、男，2、女，3、隐私）：\t");
            int gender = scan.nextInt();

            Person p = new Person(name,age,gender);
            ps[idx++] = p;

            System.out.println("是否继续（y/n）");
            String option = scan.next();
            if ( "n".equals(option) ){
                mainPage();
                break;
            }
        }
    }
    public void showData(){
        System.out.println("展示用户信息：");
        System.out.print("姓名\t\t"+"\t"+"年龄\t"+"\t\t"+"性别\n");
        for ( Person p : ps ){
            if ( p != null ){
                System.out.println(p.name+"\t\t"+p.age+"\t\t\t"+p.gender);
            }

        }

        mainPage();

    }

}
