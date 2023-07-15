package com.iweb.learn0715;
/*
*
* 多维数组
* java 没有多维的概念，只能数组套数组
 */
public class TwoDimasionGroupTester {
    public int[] gourp;

    public int[][] mdgroup = new int[][]{{1,12},{2,3,5}};

    public String[][] box = new String[][]{{"A","♠"},{"A","♥"}};

    public void test(){
        System.out.println(box[0][0]);
    }

    public static void main( String[] args ) {
        TwoDimasionGroupTester tt = new TwoDimasionGroupTester();
        tt.test();
    }
}
