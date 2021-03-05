package day50_Polymorphism;

import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.CybertekDriver;
import day49_Abstraction.RemoteDriverTask.FireFoxDriver;
import day49_Abstraction.RemoteDriverTask.WebDriver;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Rectangle;
import day49_Abstraction.ShapeTask.Shape;
import day50_Polymorphism.PhoneTask.IPhone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        IPhone iphone1 = new IPhone("Iphone 12", "6.0", "Black", 1400);

        Samsung samsung1 = new Samsung("Galaxy S20", "Medium", "Black", 900);

        Phone phone1 = new IPhone("Iphone 10", "6.0", "White", 1400);

        Phone phone2 = new Samsung("Galaxy S18", "Medium", "Black", 900);


        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(iphone1);
        phones.add(samsung1);


        Shape shape;
        shape = new Circle(3);
        System.out.println(shape.area());
        shape = new Cube(4);
        System.out.println(shape.area());
        shape = new Rectangle(4, 6);
        System.out.println(shape.area());

        System.out.println("================================================");

        String browserName = "chrome";

        WebDriver driver;

        switch (browserName) {
            case "firefox":
                driver = new FireFoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "cybertek":
                driver = new CybertekDriver();
                break;
            default:
                throw new RuntimeException("No such a browser!");
        }


        int[] arr = {10, 12, 4, 5, 6, 3};
        int[] arr2 = {10, 5, 6, 3, 12, 4};

        int j = 0;
        Integer[] arr3 = new Integer[6];
//        for (int i : arr2) {
//            arr3[j++] = i;
//        }

        for(int i = 0; i<arr2.length; i++){
            arr3[i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3) + " arr3");

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println("Compare: " + Arrays.equals(arr, arr2));

        //System.out.println(equals(arr, arr2));

        System.out.println(arr.length == arr2.length && Arrays.asList(arr).containsAll(Arrays.asList(arr2)));


    }

    public static boolean equals(Object[] a, Object[] b) {
        return a.length == b.length && Arrays.asList(a).containsAll(Arrays.asList(b));
    }

}
