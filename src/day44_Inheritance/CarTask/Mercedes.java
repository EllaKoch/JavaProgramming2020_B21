package day44_Inheritance.CarTask;

public class Mercedes extends Car{

    public Mercedes(String model, String color, double price, int year) {
        super("Mercedes", model, color, price, year);
    }


    public void start() {
        System.out.println("First push Brake, Push the START button");
    }
}
