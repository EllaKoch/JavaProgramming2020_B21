package day18_Strings;
import java.util.Scanner;
public class InitialsTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String f = scan.nextLine().toUpperCase();

        System.out.println("Enter your last name:");
        String l = scan.nextLine().toUpperCase();

       // String initials = f.substring(0,1)+"."+ l.substring(0,1); //this ways is same result
      String initials = f.charAt(0) + "." + l.charAt(0);

        System.out.println(initials);


    }
}
/*
 2. write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S

 */
