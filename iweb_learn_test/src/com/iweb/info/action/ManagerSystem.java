package com.iweb.info.action;

import java.util.Scanner;

public class ManagerSystem {

    public void exeute(CoreLogic logic){
        System.out.println("欢迎进入学生信息管理系统。");
        while ( true ){
            logic.showMenu();
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            logic.choice(choice);

            logic.process();
        }
    }

    public static void main( String[] args ) {

        ManagerSystem ms = new ManagerSystem();
        ms.exeute(new StudentsRecordCoreLogic());
    }
}
