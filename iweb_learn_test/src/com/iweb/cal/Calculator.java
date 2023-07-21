package com.iweb.cal;

import java.util.Scanner;

public class Calculator {
    public void execute(Logic l){
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎使用计算器");
        while ( true ){
            l.inputnum();
            l.choice();
            l.output();
            System.out.println("是否继续（y/n）");
            String option = scan.next();
            if ("n".equals(option)){
                return;
            }
        }
    }

    public static void main( String[] args ) {
        Calculator c = new Calculator();
        c.execute(new NormalLogic());
    }
}
