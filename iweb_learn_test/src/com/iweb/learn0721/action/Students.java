package com.iweb.learn0721.action;

import com.iweb.learn0721.pojo.InterA;
import com.iweb.learn0721.pojo.InterB;

public class Students implements InterA, InterB {
    @Override
    public void addName() {
        System.out.println("luck");
    }

    @Override
    public void addAge() {
        System.out.println("23");

    }

    @Override
    public void addGender() {
        System.out.println("男");

    }

    @Override
    public void addId() {
        System.out.println("123456");

    }

    @Override
    public void addGrade() {
        System.out.println("九年级");

    }
}
