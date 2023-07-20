package com.iweb.info.pojo;

public class Student {
    private String name;
    private Integer age;
    private Integer gender;//0 F, 1 M
    private String id;//6位随机


    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge( Integer age ) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender( Integer gender ) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }
}
