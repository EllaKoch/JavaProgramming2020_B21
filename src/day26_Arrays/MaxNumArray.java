package day26_Arrays;

import java.util.Scanner;

/*
 2. write a program that can return the maximum number from an array of integers

 */
public class MaxNumArray {
    public static void main(String[] args) {
        int[] numbers = {100,2,3,400,5,6,7};

        int max = numbers[0];

        for(int i = 1; i <numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);







    }
}
