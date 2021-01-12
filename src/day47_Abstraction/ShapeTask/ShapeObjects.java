package day47_Abstraction.ShapeTask;

public class ShapeObjects { //has a
    public static void main(String[] args) {

        Circle circle = new Circle(3.5);
        System.out.println("circle area = " + circle.area());
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("rectangle area = " + rectangle.area());
        Square square = new Square(5.5);
        System.out.println("square area = " + square.area());


    }
}
