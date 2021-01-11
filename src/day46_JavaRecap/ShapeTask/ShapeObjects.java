package day46_JavaRecap.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);

        System.out.println(circle1);
        System.out.println(circle1.getR());
        System.out.println(circle1.getD());

        Rectangle rectangle = new Rectangle(3,5);

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle);

    }
}
