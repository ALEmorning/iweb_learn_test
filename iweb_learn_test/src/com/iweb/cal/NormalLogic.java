package com.iweb.cal;

import java.math.BigDecimal;
import java.util.Scanner;



public class NormalLogic implements Logic{
    String n1,n2,code;
    Scanner scan = new Scanner(System.in);


    @Override
    public void inputnum() {
        System.out.println("the first number:");
        this.n1 = scan.next();
        System.out.println("the second number:");
        this.n2 = scan.next();
    }

    @Override
    public void choice() {
        System.out.println("what calculator do u want to do:");
        System.out.println("1、+\t2、-\t3、×\t4、÷");
        System.out.println("5、mod\t6、平方\t7、次幂\t8、n!");
        this.code = scan.next();
    }

    @Override
    public void output() {
        BigDecimal bd = null;
        BigDecimal one = new BigDecimal(n1);
        BigDecimal two = new BigDecimal(n2);

        switch ( code ){
            case "1":
                bd = BaseCal.add(one,two);
                System.out.print(n1+" + "+n2+" = ");
                break;
            case "2":
                bd = BaseCal.subtract(one,two);
                System.out.print(n1+" - "+n2+" = ");
                break;
            case "3":
                bd = BaseCal.multiply(one,two);
                System.out.print(n1+" × "+n2+" = ");
                break;
            case "4":
                bd = BaseCal.divide(one,two);
                System.out.print(n1+" ÷ "+n2+" = ");
                break;
            case "5":
                bd = BaseCal.modulus(one,two);
                System.out.print(n1+" % "+n2+" = ");
                break;
            case "6":
                bd = BaseCal.square(one);
                System.out.print(n1+" 的平方为：");
                break;
            case "7":

                bd = BaseCal.power(one,two);
                System.out.print(n1+" 的 "+n2+" 次幂为：");
                break;
            case "8":
                bd = BaseCal.factorial(one);
                System.out.print(n1+" 的阶乘为： ");
                break;
            default:
                System.out.println("选择错误，请重新输入：");
                choice();
        }

//        System.out.println(bd.toString());

        if ( bd.toString().contains(".") ){
            System.out.println(bd.doubleValue());
        }else {
            System.out.println(bd.intValue());
        }
    }
}
