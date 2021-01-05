package day44_Inheritance.shapesTask;

public class Cube extends Shape{

    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;

    }


    public double calcArea() {
        Square square = new Square(side);// one square of the cube
        double area = square.calcArea();// are of one square
        return area * 6;
        // or return new Square(side).calcArea() * 6;
        //  or return side * side * 6;
    }


    public double calcPerimeter() {
        return new Square(side).calcPerimeter() * 12;
        //  or return side * 12;
    }
}
