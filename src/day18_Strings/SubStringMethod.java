package day18_Strings;
import java.util.Scanner;
public class SubStringMethod {
    public static void main(String[] args) {
        String str = "Today is Monday";
        //            0123456789

        String day = str.substring(9, 15);//(9, 14 + 1)
        System.out.println("day = " + day);

        String email = "cybertek@gmail.com";
        //              0123456789    14

        String domain = email.substring(9, 13+1);//14 for l
        System.out.println("Domain of the email " +email + " is: " +domain);
        System.out.println("============================");
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a word");
//        String word1 = scan.next();
//        System.out.println("Enter the second word");
//        String word2 = scan.next();
//
//        System.out.println(word1.substring(1)+word2.substring(1));

        System.out.println("=================================");

        String s1 = "I like movies and books";
        //           0123456789 12
        String Word1 = s1.substring(7, 12+1);
        System.out.println(Word1);

        System.out.println("=================================");

        String firstName = "cYBERtek"; //cybertek

        String firstChar = firstName.substring(0, 1).toUpperCase();
        String rest = firstName.substring(1,firstName.length()-1+1).toLowerCase();//-1+1=0

        System.out.println(firstChar);
        System.out.println(rest);

        firstName = firstChar + rest;
        System.out.println(firstName);






    }
}
