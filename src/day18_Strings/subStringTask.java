package day18_Strings;
import java.util.Scanner;
public class subStringTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1, firstName.length()-1+1).toLowerCase();

        System.out.println("First name is: "+firstName);

        System.out.println("Enter your last name");
        String lastName = scan.next();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1, lastName.length() -1+1).toLowerCase();

        System.out.println("Last name is: "+lastName);

        System.out.println(firstName+ " "+ lastName);//same as below
        System.out.println(firstName.concat(" "+lastName));

    }
}
