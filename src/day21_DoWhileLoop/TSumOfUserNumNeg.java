package day21_DoWhileLoop;
import java.util.Scanner;
/*
1.  Write a program that calculates the sum of numbers entered by the user until
user enters a negative number.
            hint: you need an infinite loop

 */
public class TSumOfUserNumNeg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int result = 0;

        for(int i = 0; i<1;){//infinite times

            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if(num<0){//if user entered neg number it will not be added to the result
                break;
            }
            result  += num;//or place it in the else block

        }
            scan.close();
        System.out.println("result = " + result);
    }
}
