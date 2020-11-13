package day26_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueAndDuplicateNumbersArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int[] numbers = new int[scan.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number: " + (i+1));
            numbers[i] = scan.nextInt();
        }
        scan.close();
        String unique = "";
        String duplicates = "";

        for(int j = 0; j < numbers.length; j++){
            int num = numbers[j];
            int count = 0;
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i]==num){
                    count++;
                }
            }
            if(count==1 && !unique.contains(num+"")){
                unique += numbers[j] + " ";
            }else{
                if(!duplicates.contains(num+""))
                duplicates += numbers[j] +" ";
            }
        }
        System.out.println("Duplicate numbers: " + duplicates);
        System.out.println("Unique numbers: " + unique);

        }
    }

