package day50_Polymorphism;


import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Dog;
import day46_JavaRecap.CarTask.BMW;
import day46_JavaRecap.CarTask.Car;
import day46_JavaRecap.CarTask.Tesla;

import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Shape;

public class PolymorphismRules {
    public static void main(String[] args) {

        Animal animal = new Dog("Fred", "chow chow", 'M', 4, "Ginger", "Large");
        // reference type decides what to call from the object, Object type decides which impl-ion to execute
        animal.eat("meat");

        Cube cube = new Cube(5);
        System.out.println(cube.area());
        System.out.println(cube.volume());
        System.out.println(cube.perimeter());

        Shape shape = new Cube(5);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());

        System.out.println("==================================================");

        Car car = new Tesla("Model 3", "White", 2019, 45000);
        car = new BMW("M3", "white", 2020, 30000);

        car.start();

        System.out.println("==================================================");

        Animal animal2 = new Dog("Lucy", "Husky", 'M', 2, "red", "Small");

        // animal2.bark();


    }
}
