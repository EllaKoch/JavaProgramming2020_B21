package day03_Variables;

public class CalculateSquareAndCircle {
    public static void main(String[] args) {
        //calculate Square
        int side = 10;
        int area = side*side;
        int perimeter = side*4;
        System.out.print("Area of Square is: ");
        System.out.print(area);
        System.out.print("\nPerimeter of Square is: ");
        System.out.print(perimeter);

        System.out.println("\n==============================");
        // calculate Circle
        //A = radius * radius * PI
        //P = 2 * radius * PI

        double radius = 7.5;
        double PI = 3.14;
        double area1  = radius * radius * PI;
        double perimeter1 = 2 * radius * PI;
        System.out.print("Area of Circle is:");
        System.out.print(area1);
        System.out.print("\nPerimeter of Circle is:");
        System.out.print(perimeter1);

    }
}
