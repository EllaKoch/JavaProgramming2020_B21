package day54_Map;


import day43_Inheritance.CarTask.BMW;
import day43_Inheritance.CarTask.Car;
import day46_JavaRecap.ShapeTask.Circle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GarbageCollection {
    public static void main(String[] args)  {

       // new GarbageCollection().finalize(); // called by the Garbage Collector once object is unreferenced

        String str1 = "Muhtar";
        System.out.println(str1);// top to bottom

        str1 = "Kuzzat";// "Muhtar" does not have reference == eligible for Garbage Collection
        str1 = "Ghurhan";// "Kuzzat" does not have reference == eligible for Garbage Collection
        str1 = "Saim";// "Ghurhan" does not have reference == eligible for Garbage Collection

        System.out.println(str1);

        Circle c1 = new Circle(5);
        c1 = null;
        //driver = null;
        System.out.println(c1);


        Car car1 = new BMW("X5", "Red", 2011, 40000, 20000);// garbage collector will collect it
        car1 = new BMW("S6", "Black", 2017, 300, 30000);

        System.out.println(car1.model);

        System.out.println("=======================================================");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 4, 5, 6, 7));// GarbCollection


        list1 = new ArrayList<>(Arrays.asList(2, 5, 4, 3, 6));

        System.out.println(list1);


        new BMW("S6", "Black", 2017, 300, 30000);
    }


}
