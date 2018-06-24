package oop.lesson2.interface_example;

import oop.lesson1.Car;

public class JamesBondCar extends Car implements Swimable {

    public JamesBondCar(String model, String color, int doors) {
        super(model, color, doors);
    }

    @Override
    protected void startEngine() {
        System.out.println("Start James Bond car");
    }

    @Override
    public void shoot() {
        System.out.println("bam-bam");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}
