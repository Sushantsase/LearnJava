package com.oop.inheritance;

class Vehicle{

    public void fuelUp(){
        System.out.println("fuelaa");
    }
}

class Car extends Vehicle{

    public void color(){
        System.out.println("color");
    }
    @Override
    public void fuelUp(){
        System.out.println("fuel sssss");
    }

}

public class ExtendsExample {
    public static void main(String[] args) {
    Vehicle vec = new Vehicle();
    vec.fuelUp();

    Car car = new Car();
    car.color();
    car.fuelUp();

    }
}
