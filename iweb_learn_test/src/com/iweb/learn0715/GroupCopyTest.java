package com.iweb.learn0715;

import java.util.Random;
import java.util.Scanner;

/*
*
* 数组的拷贝测试
 */
public class GroupCopyTest {
    String[] storage = new String[5];
    public void test(){
        Scanner scan = new Scanner(System.in);
        int idx = 0;
        while ( true ){
            System.out.println("请输入你需要保存的名字：");
            String name = scan.next();
            storage[idx++]=name;

            //如果长度不够，就将数组拉长
            if ( idx == storage.length ){//判断数组长度是否还够
                String[] temp = new String[storage.length * 2];
                //把原先数组数据找回
                System.arraycopy(storage,0,temp,0,storage.length);
                storage = temp;
            }
        }
    }
    public void shrink(){
        String[] base = new String[] {"A","B","C","D","E","F"};

        String[] ng = new String[base.length-1];
        int r_idx = 3;
        //先拷贝前面的部分
        System.arraycopy(base,0,ng,0,r_idx);

        //拷贝后面的部分
        System.arraycopy(base,r_idx+1,ng,r_idx,ng.length-r_idx);



    }
    //随机
    public void rank(){
        Random r = new Random();
        r.nextInt(10);//0~9

    }


    public static void main(String[] args){
        GroupCopyTest gc = new GroupCopyTest();
//        gc.test();
        gc.shrink();;

    }
}
