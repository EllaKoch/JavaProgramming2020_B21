package day15_Scanner;
import java.util.Scanner;
public class ScannerTask1 {
    public static void main(String[] args) {
        Scanner sizeInfo = new Scanner(System.in);

        System.out.println("Please, enter your height: ");

        double height = sizeInfo.nextDouble();

        System.out.println("Please enter your shoe size: ");

        double shoe =  sizeInfo.nextDouble();

        System.out.println("Do you like wearing hats? Answer: True or False");

        boolean wearHats = sizeInfo.nextBoolean();

        System.out.println("Your height is : " + height);
        System.out.println("Your shoe size is : " + shoe);
        System.out.println("You like wearing hats: " + wearHats);

    }
}
/*

- Ask the user to enter their height (double),
shoe size (byte), and if they like to wear hats (boolean).
Print out the information

 */