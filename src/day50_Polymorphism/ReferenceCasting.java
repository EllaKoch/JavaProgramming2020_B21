package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;
import day47_Abstraction.ShapeTask.Circle;
import day47_Abstraction.ShapeTask.Shape;
import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.WebDriver;

public class ReferenceCasting {
    public static void main(String[] args) {
        // Implicit casting: Done Automatically
        int a = 10;
        double b = a;

        //explicit casting: MUST be done MANUALLY
        double d = 10.5;
        int c = (byte) d;// or short, or int

        System.out.println("==================================================");
        // upcasting: smaller reference type to larger reference type; = implicit = smaller to larger

        Circle circle = new Circle(3);
        Shape shape = (Shape) circle;// redundant casting

        WebDriver driver = new ChromeDriver();// implicit casting

        //down casting: = explicit casting = larger to smaller

        Animal animal = new Dog("Lucy", "Husky", 'M', 2, "red", "Small");// upcasting

        Dog dog = (Dog) animal;

        dog.bark();


        Animal animal2 = new Cat("Jon", "muchi", 'M', 34, "black and white", "small");

       // ( (Cat)animal2).meow();// down casting

        ((Cat) animal2).meow();
        ((Cat) animal2).meow();

        System.out.println("==================================================");





    }
}
