package day17_Strings;
/*
2. write a program to ask user to enter first name and last name
            then print the full name in all upper case

 */
import java.util.Scanner;
public class String_Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

       // System.out.println(firstName+" "+ lastName);

        System.out.println(firstName.toUpperCase()+ " ".concat(lastName).toUpperCase());
//        System.out.println("Your full name in uppercase: "+fullName.toUpperCase());
//        System.out.println("The number of characters " +
//                "in your full name including space is: "+fullName.length());
//        System.out.println("Your full name in lowercase: "+fullName.toLowerCase());
    }
}
