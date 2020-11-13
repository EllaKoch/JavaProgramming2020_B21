package day15_Scanner;
import java.util.Scanner;
public class ValidTriangleScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of the first angle");
        double angle1 = scan.nextDouble();

        System.out.println("Enter the value of the second angle");
        double angle2 = scan.nextDouble();

        double angle3 = 180-(angle1+angle2);

        if(angle1+angle2 >= 180){
            System.out.println("Invalid angles!");
        }else{
            System.out.println("The value of the third angle is: " + angle3);
        }
    }
}
/*
- Ask the user to enter two angle values (double). Find out what the
third angle of the triangle is (Triangles have 180 degrees total).
If the two angle values given exceed 180 already print "Invalid angles"
 */