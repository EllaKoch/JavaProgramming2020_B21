package day47_Abstraction.CarTask;

public class Toyota extends Car {

    public Toyota( String model, String color, int year, double price) {
        super("Toyota", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Insert the key. Twist the key to ignition");
    }
}
