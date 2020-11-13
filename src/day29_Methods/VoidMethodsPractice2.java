package day29_Methods;

import java.util.Scanner;

// 1.write a method that calculates the sum of 3 numbers
// 2. write a method that

public class VoidMethodsPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        sumOf3Nums(30, 10, 20);
        sumOf3Nums(40, 30, 10);

        //sumOf3Nums(scan.nextInt(), scan.nextInt(), scan.nextInt());

        greaterNum(30, 30);

    }

    public static void sumOf3Nums(int n1, int n2, int n3) {
        System.out.println("Sum is: " + (n1 + n2 + n3));
    }


    public static void greaterNum(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n1 + " is greater");
        } else if (n2 > n1) {
            System.out.println(n2 + " is greater");
        } else {
            System.out.println(n1 + " = " + n2);
        }
    }


}
