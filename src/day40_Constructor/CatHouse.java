package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class CatHouse {

    public static void main(String[] args) {


        Cat cat1 = new Cat("Persian", "Small", "Black and White", 'M');
        Cat cat2 = new Cat("British", "Big", "Gray", 'F');

        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(cat1, cat2));
        //cats.addAll(Arrays.asList(cat1, cat2));

        System.out.println(cats);


    }



}
