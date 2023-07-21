package com.iweb.learn0721;

public class CarFactory {
    public void createPath(CarPlan car){
        System.out.println("......");
        car.addBrand();
        car.addColor();
        car.addEngine();
        car.addSeats();
        car.addWheels();

        if ( car instanceof LuxPack ){
            ((LuxPack) car).addLeather();
            ((LuxPack) car).addStero();
            ((LuxPack) car).addOthers();
        }
        if ( car instanceof SaftyPack ){

        }
    }

    public static void main( String[] args ) {
        CarFactory cf = new CarFactory();
        cf.createPath(new DazPlan());
    }
}
