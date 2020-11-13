package day17_Strings;
/*
3. write a program to ask use to enter first name and last name
            then print the initials (first letter of first name + first letter of last name)
 */
import java.util.Scanner;
public class String_Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.next();

        System.out.println("Enter your last name:");
        String lastName = scan.next();


        //System.out.println(firstName.charAt(0)+"." + lastName.charAt(lastName.length()-1));


        System.out.print(firstName.charAt(0)+".");
        System.out.print(lastName.charAt(0)+".");

    }
}
