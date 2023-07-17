package com.iweb.homework;

import java.util.Scanner;

/*
*
* 撰写一个简单的程序用于录入用户信息，并展示出来，要有简单的功能菜单
 */
public class PlayerInfo {
    String[][] playerInfo = new String[5][];

    Scanner scan = new Scanner(System.in);
    int count = 1;
    public static void main( String[] args ) {
        PlayerInfo pi = new PlayerInfo();
        pi.mainPage();
    }
    public void mainPage(){//功能主界面，供用户选择功能
        int option;
        System.out.println("欢迎来到用户界面：");
        System.out.println("请选择功能：1、添加用户信息；2、查看所有用户信息；3、退出");
        option = scan.nextInt();
        switch ( option ){
            case 1:
                insertInfo();
                break;
            case 2:
                showInfo();
                break;
            case 3:
                System.out.println("谢谢使用，您已成功退出。");
                System.exit(0);
                return;
            default:
                System.out.println("请选择正确的功能。");
        }
    }
    public void insertInfo(){
        String name = new String();//用户相关信息，共三项：账号、密码、姓名
        String password = new String();
        String mingcheng = new String();
        String option = new String();

        if ( count == playerInfo.length - 1 ){//每次插入前，先对数组长度进行判定
            String[][] temp = new String[playerInfo.length * 2][];//双倍扩充
            //把原先数组数据找回
            System.arraycopy(playerInfo,0,temp,0,playerInfo.length);
            playerInfo = temp;//扩充数组
        }

        System.out.println("欢迎使用添加用户信息功能：");
        System.out.print("请输入用户账号：\t");
        name = scan.next();

       // System.out.println();
        System.out.print("请输入用户密码：\t");
        password = scan.next();

        //System.out.println();
        System.out.print("请输入用户姓名：\t");
        mingcheng = scan.next();

        playerInfo[count++] = new String[]{name,password,mingcheng};//将用户输入值添加进数组

        System.out.println("是否继续添加信息：y/n");
        option = scan.next();
        if ( "y".equals(option) ){
            insertInfo();//递归调用
        }else {
            System.out.println("您已退出！");
            mainPage();
        }
    }


    public void showInfo(){
        playerInfo[0] = new String[]{"账号","密码","姓名"};//首行信息，给予用户提示，列名
        System.out.println("用户信息：");
        System.out.print("账号\t\t"+"\t"+"密码\t"+"\t\t"+"姓名\n");
        for (int i = 1; i < playerInfo.length; i++) {
            if (playerInfo[i] != null) {
                System.out.print(playerInfo[i][0] + "\t\t" + playerInfo[i][1] + "\t\t" + playerInfo[i][2] + "\n");
            }
        }
        mainPage();
    }
}
