package com.iweb.learn0719;

/**
 * 封装 测试
 * @author Luck
 */
public class Person {
    public String name;
    private Integer age;

    public Person(){

    }
    public Integer getAge() {
        return age;
    }

    public void setAge( Integer age ) {
        this.age = age;//装箱

        String str = "age";
        String method_name = "set"+(char)(str.charAt(0)-32)+str.substring(1);
        System.out.println(method_name);
    }
}
