package day15_Scanner;
import java.util.Scanner;
public class Task2NumMult {
    public static void main(String[] args) {
        Scanner numResult = new Scanner(System.in);

        System.out.println("Please enter the first number");

        int num1 = numResult.nextInt();

        System.out.println("Please enter the second number");

        int num2 = numResult.nextInt();

        System.out.println(num1 + " * " + num2 + " = " + num1 *num2);



    }
}
/*
Create a program that will take two int numbers and multiply them.
Print in the following way:
    %numOne x %numTwo = %result
    Ex: 3,5 --> 3 x 5 = 15
    Ex: -2,30 --> -2 x 30 = -60

 */