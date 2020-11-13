package day22_JavaRecap;

import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;//maxValue of int
        for (int i = 1; i <= 5; i++){
            System.out.println("Enter a number "+ i);
            int n = scan.nextInt();
            if(n<min){
                min=n;
            }

        }
        scan.close();
        System.out.println("min = " + min);







    }
}
