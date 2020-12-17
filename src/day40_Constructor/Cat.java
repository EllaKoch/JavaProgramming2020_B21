package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Cat:
    	variables:
				breed, size, gender, color, numberOfLegs, numberOfEyes, numberOfWings

		add constructor to initialize all fields

		methods:
			toString()


 */
public class Cat {

    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public String breed, size, color;
    public char gender;

    static{
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
    }

    public Cat(String breed, String size, String color, char gender) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
    }


    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", Number of legs: " + numberOfLegs+
                ", Number of eyes: " + numberOfEyes +
                ", Number of Wings: " + numberOfWings+
                '}';
    }
}
 class CatHome {

    public static void main(String[] args) {



        Cat cat1 = new Cat("Persian", "Small", "Black and White", 'M');
        Cat cat2 = new Cat("British", "Big", "Gray", 'F');

        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(cat1, cat2));
        //cats.addAll(Arrays.asList(cat1, cat2));

        System.out.println(cats);


    }



}
