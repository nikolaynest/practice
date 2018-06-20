package oop.lesson1;

public class Cabriolet extends Sedan {
    public Cabriolet(String model, String color, int doors) {
        super(model, color, doors);
        System.out.println("Construct cabriolete");
    }

    public Cabriolet(String model, String color, int doors, int chair) {
        super(model, color, doors, chair);
        System.out.println("Construct cabriolet with chairs");
    }
}
