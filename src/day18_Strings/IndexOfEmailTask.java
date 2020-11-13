package day18_Strings;
import java.util.Scanner;
/*
5. write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo

 */
public class IndexOfEmailTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you email:");
        String email = scan.nextLine();

        String domain = email.substring(email.indexOf("@")+1,email.indexOf(".com"));

        System.out.println("The domain is: " + domain);

//      or:
//        int startIndex = email.indexOf("@") +1;
//        int endIndex = email.indexOf(".com");
//        String domain1 = email.substring(startIndex, endIndex);
//        System.out.println("The domain of the email is:"+domain1);
    }
}
