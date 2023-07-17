package com.iweb.homework;
import com.iweb.learn0717.*;

import java.util.Scanner;

/*
1 修改信息录入系统，用Person对象代替一维数组。
2 定义一个简单的计算器类，构造过程中过程中获取用户输入的2个数，
  并按照计算符号的不同，做出计算结果。输入输出类型均使用double。
 */
public class CalculatorWork {
    public static void main( String[] args ) {
        CalculatorWork cw = new CalculatorWork();

        cw.mainPage();

    }
    public void mainPage(){//功能主界面，供用户选择功能
        int option;
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎来到用户界面：");
        System.out.println("请选择功能：1、添加用户信息；2、查看所有用户信息；3、使用计算器；4、退出");
        option = scan.nextInt();
        switch ( option ){
            case 1:
                recordData();
                break;
            case 2:
                showData();
                break;
            case 4:
                System.out.println("谢谢使用，您已成功退出。");
                System.exit(0);
                return;
            case 3:
                calcualtorPage();
                break;
            default:
                System.out.println("请选择正确的功能。");
        }
    }
    Person[] ps = new Person[3];//通过person类定义数组
    int idx = 0;

    public void recordData(){//插入信息
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
    public void calcualtorPage(){
        Calculator c = new Calculator();
        Scanner scan = new Scanner(System.in);
        double result = 0;
        while ( true ) {
            System.out.println("请选择需要进行的运算：1、加法；2、减法；3、乘法；4、除法；5、退出");
            int option = scan.nextInt();
            if(option == 5){
                mainPage();
                break;
            }
            System.out.print("请输入第一个数：");
            double num1 = scan.nextDouble();
            System.out.print("请输入第二个数：");
            double num2 = scan.nextDouble();
            switch ( option ) {
                case 1:
                    result = c.add(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = c.subtract(num1,num2);
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = c.multiply(num1,num2);
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    result = c.divide(num1,num2);
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                default:
                    System.out.println("请输入正确功能数字！");
                    break;
            }
            System.out.println("是否继续计算（y/n）");
            String choice = scan.next();
            if ( "n".equals(choice) ){
                mainPage();
                break;
            }
        }
    }

}
