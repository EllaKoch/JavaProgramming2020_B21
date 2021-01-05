package day43_Inheritance.CarTask;

public class Toyota extends Car{


    public Toyota( String model, String color, int year, int miles, double price) {
        setInfo("Toyota", model, color, "Japan", year, miles, price);
    }


    public static boolean isAffordable, isImmortal;

    static {
        isAffordable = true;
        isImmortal = true;
    }









}
