package day44_Inheritance.shapesTask;

public class Rectangle extends Shape{

    /*
    variables inherited: name, hasShape, hasArea, hasPerimeter = 4
    methods: calcArea, calcPerimeter, toString(), setInfo() = 4
     */

    public double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;


    }

    public double calcArea(){// method overriding.
        return  width * length;
    }

    public double calcPerimeter(){// this is method overriding
        return  (width+length) * 2;
    }


}
