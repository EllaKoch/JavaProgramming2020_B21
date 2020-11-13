package day16_Scanner;

import java.util.Scanner;

public class Scanner_Close {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        input.close();//After closing, we cannot use the Scanner again

        System.out.println(input.next());//This gives exception when running, because we close the Scanner above


    }
}
