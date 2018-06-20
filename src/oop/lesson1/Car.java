package oop.lesson1;

public abstract class Car {

    protected String model;

    protected String color;

    protected int doors;

    public Car(String model, String color, int doors) {
        System.out.println("Construct Car");
        this.model = model;
        this.color = color;
        this.doors = doors;
    }



    protected void bip() {
        System.out.println("Bip-bip");
    }

    protected abstract void startEngine();


}
