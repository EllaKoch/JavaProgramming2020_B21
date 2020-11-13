package day22_JavaRecap;

import java.util.Scanner;
/*
 5. write a program that can multiply two numbers without using *
        5 * 3 = 15
        5 + 5 + 5

 */
public class MultiplyTwoNumbersLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();//8
        int num2 = scan.nextInt();//4
        scan.close();

        int result = 0;

        for(int i = 1; i<=num2; i++){
            result+=num1;//8 +8 + 8+ 8
        }
        System.out.println("result = " + result);








//        for(int i  = 1; i <=num2; i++){
//            result= result + num1;//5+5+5
//        }
//        System.out.println(result);

    }
}
