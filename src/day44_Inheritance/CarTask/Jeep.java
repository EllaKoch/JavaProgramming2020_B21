package day44_Inheritance.CarTask;

public class Jeep extends Car {

    public Jeep(String model, String color, double price, int year) {
        super("Jeep", model, color, price, year);
    }


    public void start() {
        System.out.println("Call mechanic, oil change");
    }
}
