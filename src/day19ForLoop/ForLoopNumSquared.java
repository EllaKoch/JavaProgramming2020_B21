package day19ForLoop;

import java.util.Scanner;

public class ForLoopNumSquared {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        for (int i = num; i <= num; ) {
            i = i * i;
            System.out.println(num+" squared is: "+i);
        }


    }
}
