package day15_Scanner;
import java.util.Scanner;
public class ScannerTaskNumEqual {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter the first number");
        short num1 = numbers.nextShort();
        System.out.println("Thank you!\nEnter the second number");
        long num2 = numbers.nextLong();

        if (num1 == num2){
            System.out.println("The numbers you entered are equal: " + num1 + " = " + num2);
        }else{
            System.out.println("The numbers you entered are not equal");
        }


    }
}
/*
- Write a program that will accept two numbers
 and check if two numbers are equal or not.
 */