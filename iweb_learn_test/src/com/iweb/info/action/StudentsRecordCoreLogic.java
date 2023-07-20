package com.iweb.info.action;

import com.iweb.info.pojo.Student;

import java.util.Random;
import java.util.Scanner;

public class StudentsRecordCoreLogic extends CoreLogic{
    int choice;
    int idx = 0;

    Student[] s1 = new Student[3];
    Scanner scan = new Scanner(System.in);
    @Override
    public void showMenu() {
        System.out.println("请选择需要进行的操作：");

        System.out.println("1、record");
        System.out.println("2、show");
        System.out.println("3、exit");
    }


    @Override
    public void choice( int ch ) {
        this.choice = ch;

    }


    @Override
    public void process() {
        Math.random();//0.0~1.0,小数点后面10位以上,double类型
        String id = String.valueOf(Math.random()).substring(2,8);
        switch ( choice ){
            case 1:
                while ( true ){
                    if ( idx == s1.length ){
                        Student[] temp = new Student[s1.length*2];
                        System.arraycopy(s1,0,temp,0,s1.length);
                        s1 = temp;
                    }
                    Student s = new Student();

                    System.out.println("请输入姓名：");
                    s.setName(scan.next());
//                    name = scan.next();
                    System.out.println("请输入年龄：");
                    s.setAge(scan.nextInt());
//                    age = scan.nextInt();
                    System.out.println("请选择性别（1、女；2、男；3、隐私）：");
                    s.setGender(scan.nextInt());
//                    gender = scan.nextInt();
//                    Student ss = new Student(name,age,gender,id);
                    s.setId(id);
                    s1[idx++] = s;

                    System.out.println("是否继续添加信息（y/n）");
                    String option = scan.next();
                    if ( "n".equals(option) ){
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("展示学生信息：");
                System.out.println("ID\t\t\t"+"姓名\t\t"+"\t"+"年龄\t"+"\t\t"+"性别");
                for ( Student s : s1 ){
                    if ( s != null )
                    System.out.println(s.getId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t\t"+s.getGender());
                }
                break;
            case 3:
                System.exit(0);
        }
    }
}
