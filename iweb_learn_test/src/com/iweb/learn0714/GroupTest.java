package com.iweb.learn0714;

import java.util.Random;

/*
*
* 数组测试
* @time 2023.7.14
 */
public class GroupTest {
    public void testA(){
        int[] ages = new int[10];
        int[] ax = {1,2,3,4,5};
//        int x = new Integer(1);
//        int y = new Integer(1);
//        System.out.println(x == y);//true
//        System.out.println(ax.length);//数组本身的长度，与内容无关
//        for ( int i =0;i<ax.length;i++ ){
//            System.out.println(ax[i]);
//        }

//        Random rand = new Random();
//        int[] g = new int[10];
//
//        for ( int i =0 ; i<g.length;i++ ){
//            g[i] = rand.nextInt(100);
//        }
//        for ( int every :g ){
//            System.out.println(every);
//        }
        //再加 2 个数字
//        int[] n = new int[g.length+2];
//        for ( int i=0;i<g.length;i++ ){
//            n[i] = g[i];
//        }
//        n[g.length] = 99;
//        n[g.length+1] = 92;
//        for ( int every : n ){
//            System.out.println(every);
//        }
        //复制数组
//        int[] y = new int[ax.length];
//        System.arraycopy(ax,0,y,0,ax.length);
//
//        for ( int every : y ){
//            System.out.println(every);
//        }
        //随机生成一个随机长度的数组
        Random r = new Random();
        int[] g = new int[r.nextInt(100)];

        for ( int i = 0;i<g.length;i++ ){
            g[i] = r.nextInt(100);
        }
        for ( int every : g ){
            System.out.print(every+" ");
        }
        System.out.println();
        for ( int i =0;i<g.length;i++ ){
            for ( int j=0;j<g.length-1-i;j++ ){
                int a = g[j];
                int b = g[j+1];
                if(a>b){
                    g[j] = b;
                    g[j+1] = a;
                }
            }
        }
        for ( int every : g ){
            System.out.print(every+" ");
        }

    }
    public void CreatA(){
        String[] pokerDeck = new String[54];
        // 创建花色数组和数字数组
        String[] suits = {"♠", "♥", "♣", "♦"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // 构建扑克牌数组
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                pokerDeck[index] = suit + rank;
                index++;
            }
        }

        // 添加大小王
        pokerDeck[52] = "小王";
        pokerDeck[53] = "大王";

        // 打印扑克牌数组
        for (String card : pokerDeck) {
            System.out.println(card);
        }
    }

    public static void main(String[] args){
        GroupTest t1 = new GroupTest();
        t1.testA();
//        t1.CreatA();
    }
}
