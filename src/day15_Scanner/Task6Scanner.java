package day15_Scanner;

import java.util.Scanner;

public class Task6Scanner {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Please enter three numbers in a separate line");
        System.out.println("Enter the first number");
        int num1 = numbers.nextInt();
        System.out.println("Enter the second number");
        int num2 = numbers.nextInt();
        System.out.println("Enter the third number");
        int num3 = numbers.nextByte();

        if (num1 > 0 && num2 > 0 && num3 > 0) {
            System.out.println("The sum of the numbers entered is: " + (num1 + num2 + num3));

        } else if (num1 > 0 && num2 > 0) {
            System.out.println("The sum of the positive numbers is: " + (num1 + num2));
        } else if (num1 > 0 && num3 > 0) {
            System.out.println("The sum of the positive numbers is: " + (num1 + num3));
        } else if (num2 > 0 && num3 > 0) {
            System.out.println("The sum of the positive numbers is: " + (num2 + num3));
        } else {
            System.out.println("You have not entered positive numbers.");
        }
    }
}
/*
Write a program that ask user to enter 3 numbers
and shows the sum of the numbers.
    Part 2: Ask the user to enter 3 numbers and calculate
    the sum of the numbers, but only include positive numbers in the total

 */