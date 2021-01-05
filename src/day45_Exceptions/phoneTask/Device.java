package day45_Exceptions.phoneTask;

public class Device {

    public String brand, model;
    public String country;// initialize first if its final
    public double price;

    public Device(String brand, String model, String country, double price){
        this.country = country;
        this.brand  = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", country= '" + country + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*
01/05/2020
Topics: Exceptions
Warmup task:
    Phone Task:
            creata a class called device:
                attributes: brand, model, price, country
                methods: toString
    create a class called phone:
                attributes: brand, model, price, country
                methods: call, text,  toString
    create the following subclasses of phone:
                        1. iPhone
                        2. Samsung
                        3. Nokia
    create constructors in each sub class that can initialize the instance variables
OOP:
    Encapsulation
    Inheritance
    Abstraction
    Polymorphism
 */