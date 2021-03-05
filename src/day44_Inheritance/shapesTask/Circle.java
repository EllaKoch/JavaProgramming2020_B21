package day44_Inheritance.shapesTask;

public class Circle extends Shape {

    /*
    variables inherited: name, hasShape, hasArea, hasPerimeter = 4
    methods: calcArea, calcPerimeter, toString(), setInfo() = 4
     */

    public double radius, diameter;
    public final static double PI;

    static {
        PI = 3.14;
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
        diameter = radius * 2;
    }
@Override
// overriding saves memory in the heap. by using same method and overriding it. Has to happen in subClass only!
    public double calcArea(){// this is method overriding
        return  radius * radius * PI;
    }

    public double calcPerimeter(){// this is method overriding
        return  diameter * PI;
    }

   
}

/*
 2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
             give the instance variables that are needed to calculate the Area,
              perimeter, of those shapes

 */