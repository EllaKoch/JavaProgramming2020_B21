package day17_Strings;
/*
6. write a program to ask the user their age.
Add 5 to their age and print: In 5 years you will be $newAge years old
 */

import java.util.Scanner;

public class String_Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        byte age = scan.nextByte();
        age += 5;
        System.out.println("In five years you will be " + age + " years old");
    }
}
