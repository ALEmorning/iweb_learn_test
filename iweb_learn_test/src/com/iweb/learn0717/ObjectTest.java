package com.iweb.learn0717;
/*
*
* 对 类 的测试
* @author  luck
* @time    2023.7.17
*
 */
public class ObjectTest {
    //public:访问权限修饰符
    //class:类修饰符
    //ObjectTest:类名，命名需满足驼峰结构
    public int i = 10; // 全局变量，可以不赋予初值

    {//代码块
        int p =100;//局部变量，写在方法中
    }
    //方法  函数  功能
    public void test(){

    }

    //构造方法
    public ObjectTest(){

    }

    public static void main( String[] args ) {
//        ObjectTest ot = new ObjectTest();
//        Person p = new Person("luck","123456");
//        Person p1 = new Person("luck",18);
        Calculator c = new Calculator();

    }


}
