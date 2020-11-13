package day26_Arrays;

import java.util.Scanner;
/*
 4. Write a program that can return the average number from an array of integers
            ex:
                [1,2,3]
                average: 2
                [10, 15, 5, 6]

 */
public class MinMaxArray {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();

        double[] numbers = new double[length];

        for(int i = 0; i <numbers.length;i++){
            System.out.println("Enter a number:");
            numbers[i] = scan.nextDouble();//gets the users input and stores them into the array starting from i
        }
        double min = numbers[0];
        double max = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);








    }
}
