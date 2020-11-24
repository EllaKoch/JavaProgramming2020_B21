package day26_Arrays;

import java.util.Scanner;
/*
 5. Write a program that can return the average number from user inputs
            ex:
                [1,2,3]
                average: 2
                [10, 15, 5, 6]
                average: 9

 */

public class AverageNumArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();

        int[] numbers = new int[length];

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
