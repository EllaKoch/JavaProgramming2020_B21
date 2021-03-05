package day50_Polymorphism;

import com.sun.tools.javac.util.Assert;
import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day43_Inheritance.CarTask.BMW;
import day43_Inheritance.CarTask.Car;
import day43_Inheritance.CarTask.Toyota;
import day45_Exceptions.phoneTask.Iphone;
import day45_Exceptions.phoneTask.Phone;
import day45_Exceptions.phoneTask.Samsung;
import day48_Abstraction.AnimalTask.Dog;
import day49_Abstraction.RemoteDriverTask.*;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Cylinder;
import day49_Abstraction.ShapeTask.Shape;

public class DownCasting {
    public static void main(String[] args) {

        Shape shape = new Cylinder(3,5);

        Cylinder cylinder = (Cylinder) shape;
        System.out.println(cylinder.volume());

        double volume =  ((Cylinder) shape).volume();
        System.out.println(volume);

        System.out.println("======================================");

        Animal animal = new Cat("Lucy", "Husky", 'M', 2, "red", "Small");

       Car car = new Toyota("Camry", "White", 2020, 20000, 30000);

        //((BMW) car).race();// classClassException

        System.out.println("======================================");

        Phone phone = new Samsung("da",1000);

       // ((Iphone)phone).faceTime("sdkaj");// classClassException


        System.out.println("======================================");

        WebDriver driver = new ChromeDriver();

        ((TakeScreenShot) driver).TakeScreenShot("pic");

        ((JavaScriptExecutor) driver).executeScript("");

        System.out.println("======================================");

        Shape shape2 = new Circle(3);

       // ((Cube)shape2).volume();// classClassException

        System.out.println("======================================");

        ((TakeScreenShot)driver).TakeScreenShot("");
        ((JavaScriptExecutor) driver).executeScript("");

        System.out.println("======================================");

        RemoteDriver driver1 = (RemoteDriver) new ChromeDriver();// up casting = implicit
        JavaScriptExecutor js = new FireFoxDriver();
        TakeScreenShot ts = new FireFoxDriver();

        System.out.println("======================================");

        boolean isChrome = driver instanceof ChromeDriver;

        System.out.println(isChrome);


    }
}
