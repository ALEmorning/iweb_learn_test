package com.iweb.learn0718;

/**
 * 参数传递测试 -- 参数的种类 和 注意事项
 * 1、值传递与引用传递
 * 2、任何类型都可以成为参数类型
 * 3、参数可以定长，也可以不定长
 */
public class AgrumentsTester {
    //可变与不可变共同使用时，可变放在最后
    public void show(int ... j){//可变长度，其实可以将其视为一个数组
        for ( int every : j ) {
            System.out.println(every);

        }
    }

    public static void main( String[] args ) {
        AgrumentsTester at = new AgrumentsTester();
        at.show(1,2,3,4,5);
    }

}
