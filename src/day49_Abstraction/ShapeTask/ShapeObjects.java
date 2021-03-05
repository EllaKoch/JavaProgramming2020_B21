package day49_Abstraction.ShapeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(23);
        Rectangle rectangle = new Rectangle(10, 20);
        Cube cube = new Cube(15);
        Cylinder cylinder = new Cylinder(2, 5);
        Square square = new Square(50);


        System.out.println(circle);
        System.out.println(cylinder);
        System.out.println(rectangle);
        System.out.println(cube);
        System.out.println(square);

        System.out.println(circle.getD());
        System.out.println(rectangle.getW());

        System.out.println("====================================");

        Shape[] shapes = {circle, rectangle, cube, cylinder,
                square, new Circle(5), new Circle(3), new Circle(15)};

        for (Shape eachShape : shapes) {
            if (eachShape.getName().equals("Circle")) {
                System.out.println(eachShape);
            }
        }

        System.out.println("=========================================");
        ArrayList<Shape> circles = new ArrayList<>();
        circles.addAll(Arrays.asList(shapes));

        circles.removeIf(p -> !p.getName().equals("Circle"));
        System.out.println(circles.size());

        System.out.println("=============================================");

        circles.forEach(p -> {
            System.out.println(p);
        });

        System.out.println("=============================================");

        for (Shape eachShape : circles) {
            if (eachShape.area() > 400) {
                System.out.println(eachShape);
            }
        }

        circles.forEach(p -> {
            if (p.area() > 400)// in lambda: the variable is immutable
                System.out.println(p);
        });


        System.out.println("==============================================");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list.forEach(p -> {
            if (p % 2 == 2)
                p *= 2;
        });// cannot make change to a variable (p) == final

        System.out.println(list);

        System.out.println("==============================================");

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> greaterThan5 = new ArrayList<>();


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        numbers.forEach(p -> {if(p%2==0) evenNumbers.add(p); else oddNumbers.add(p);});

        numbers.forEach(p -> { if(p>5) greaterThan5.add(p);});

        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);
        System.out.println("greaterThan5 = " + greaterThan5);


    }
}
