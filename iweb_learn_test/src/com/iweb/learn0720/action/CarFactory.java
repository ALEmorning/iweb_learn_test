package com.iweb.learn0720.action;

public class CarFactory extends BMWPlan{
    public void path(CarPlan plan){
        plan.addBrand();
        plan.addColoe();
        plan.addEngine();
        plan.addWheels();
    }

    public static void main( String[] args ) {
        CarFactory cf = new CarFactory();
        cf.path(new BMWPlan());
    }
}
