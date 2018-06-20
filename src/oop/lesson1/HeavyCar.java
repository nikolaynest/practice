package oop.lesson1;

public class HeavyCar extends Car {

    public HeavyCar(String model, String color, int doors) {
        super(model, color, doors);
        System.out.println("Construct heavy");
    }

    @Override
    public void startEngine() {
        System.out.println("Start our " + model + " with " + color + " car with button ");
    }

}
