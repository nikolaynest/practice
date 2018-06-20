package oop.lesson1;

public class Sedan extends Car {

    protected int chair;

    public Sedan(String model, String color, int doors) {
        super(model, color, doors);
        System.out.println("Construct Sedan");
    }

    public Sedan(String model, String color, int doors, int chair) {
        this(model, color, doors);
        this.chair = chair;
        System.out.println("Construct Sedan with chair");
    }



    @Override
    public void startEngine() {
        System.out.println("Start our " + model + " with " + color + " car with key");
    }

}
