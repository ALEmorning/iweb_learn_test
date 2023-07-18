package com.iweb.learn0718;

/**
 * 递归测试
 *
 */
public class Loop {
    public void loop( int go){
        System.out.println(go);
        if ( go > 100 ){
            return;
        }
        loop(++go);
    }

    public static void main( String[] args ) {
        Loop l = new Loop();
        l.loop(1);
    }
}
