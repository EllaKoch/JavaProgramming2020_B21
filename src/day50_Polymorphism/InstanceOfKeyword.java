package day50_Polymorphism;

import day48_Abstraction.AnimalTask.Animal;
import day48_Abstraction.AnimalTask.Dog;
import day48_Abstraction.AnimalTask.Dolphin;
import day48_Abstraction.AnimalTask.Eagle;

public class InstanceOfKeyword {
    public static void main(String[] args) {

        Animal animal = new Dolphin("xx", "yy", "t", 'f', 12);

        boolean isDog = animal instanceof Dog;
        boolean isDolphin = animal instanceof Dolphin;
        boolean isEagle = animal instanceof Eagle;
        boolean isAnimal = animal instanceof Animal;


        System.out.println(isDog);
        System.out.println(isDolphin);
        System.out.println(isEagle);
        System.out.println(isAnimal);


    }
}
