package com.iweb.learn0720;

import com.iweb.learn0720.pojo.Person;

/**
 * 继承 Person
 * @author Luck
 */
public class Students extends Person {
    public Students(){
        System.out.println("这是 Student 类");
    }
    @Override //重新注解
    public void mouth(){
        System.out.println("除了吃还是吃。");
    }

    public static void main( String[] args ) {
        Person s = new Students();
        s.mouth();
        
    }
}
