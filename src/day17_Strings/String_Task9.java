package day17_Strings;// done 100%
/*
9. Ask the user enter an account number. Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do
    not meet the expected results print “Invalid account number”
 */
import java.util.Scanner;
public class String_Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String accountNum = scan.nextLine();

        if (accountNum.charAt(0) == '2' && accountNum.length() == 7) {
            System.out.println("Your account number is valid and is 7 characters long");

        } else if (accountNum.charAt(0) == '5' && accountNum.length() == 10) {
            System.out.println("Your Account number is valid and it is 10 characters long");
        } else {
            System.out.println("Invalid account number");
        }
    }
}
