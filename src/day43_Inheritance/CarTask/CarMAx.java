package day43_Inheritance.CarTask;

public class CarMAx { // has A relation with toyota and bmw
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Blue", 2019, 23500, 10000);

        BMW bmw = new BMW("X5", "Red", 2018, 1234, 35000);


        System.out.println(toyota);
        System.out.println(bmw);

        System.out.println(BMW.isExpensive);
        System.out.println(BMW.isLuxury);

        System.out.println(Toyota.isImmortal);
        System.out.println(Toyota.isAffordable);


    }
}
