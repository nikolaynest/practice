package oop.lesson1;

import oop.lesson2.interface_example.Shootable;

public class PolimorfizmExample {

    public void showPolimorfizm(Car car){
        car.startEngine();
    }
    public void exampleWithInterface(Shootable shootable){
        shootable.shoot();

    }
    public static void main(String[] args) {
        Car sedan = new Sedan("Audi","red", 5);
        Car heavy = new HeavyCar("kamaz", "blue", 2);
        Car cabriolet = new Cabriolet("honda", "white", 3);
        PolimorfizmExample example = new PolimorfizmExample();

        example.showPolimorfizm(sedan);
        example.showPolimorfizm(heavy);
        example.showPolimorfizm(cabriolet);
        ((Cabriolet)cabriolet).openRoof();

    }
}
