package com.iweb.learn0721;

public class DazPlan implements CarPlan , LuxPack{
    @Override
    public void addEngine() {
        System.out.println("添加引擎");
    }

    @Override
    public void addColor() {
        System.out.println("黑色");
    }

    @Override
    public void addBrand() {
        System.out.println("大众商标");
    }

    @Override
    public void addSeats() {
        System.out.println("四座");

    }

    @Override
    public void addWheels() {
        System.out.println("四个轮子");

    }

    @Override
    public void addLeather() {
        System.out.println("真皮");

    }

    @Override
    public void addStero() {
        System.out.println("音响");

    }

    @Override
    public void addOthers() {
        System.out.println("冰箱");

    }
}
