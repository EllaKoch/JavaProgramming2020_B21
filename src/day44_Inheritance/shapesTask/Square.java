package day44_Inheritance.shapesTask;

public class Square extends Shape {

    /*
    variables inherited: name, hasShape, hasArea, hasPerimeter = 4
    methods: calcArea, calcPerimeter, toString(), setInfo() = 4
     */

    public double side;

    public Square(double side) {
        super("Square");
        this.side = side;


    }

    public double calcArea(){// method overriding
        return side * side;
    }

    public double calcPerimeter(){// this is method overriding
        return  4*side;
    }



}
