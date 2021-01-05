package day44_Inheritance.shapesTask;

public class ShapeObjects {
    public static void main(String[] args) {

        // each shape has its own formula


        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4,5);
        Square square = new Square(3);
        Triangle triangle = new Triangle(4, 4, 3);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(triangle);



    }
}
