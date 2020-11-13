package day22_JavaRecap;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {

        String sentence = "My name is Elvira";

        String name = "";

        name = sentence.substring(11,sentence.length()-1+1);//or sentence.length()

        System.out.println(name);

        String name2 = "";
        name2 = sentence.substring(11);

        System.out.println(name2);

        String str1 = "Monday is cool, it's a fun day";
                    // 012345
        String day1 = str1.substring(0,5+1);//0,6
        System.out.println(day1);

        String day2 = str1.substring(0,str1.indexOf(" "));

        System.out.println(day2);

        String s1 = "http://www.amazon.com";// .com, .edu.

        String domain = s1.substring(s1.lastIndexOf(".")+1);
        System.out.println(domain);

        String webName = s1.substring(s1.indexOf(".")+1,s1.lastIndexOf("."));
        System.out.println(webName);

//       String webName1 = webName.substring(0,1).toUpperCase();
//        System.out.println(webName1.concat(webName.substring(1)));

        webName = webName.substring(0,1).toUpperCase() + webName.substring(1);
        System.out.println(webName);

        System.out.println("=====================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first name: ");

        String firstName = scan.nextLine().toLowerCase().replace(" ", "").trim();
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine().toLowerCase().replace(" ", "").trim();
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        scan.close();

        String fullName = firstName+" "+ lastName;
        System.out.println(fullName);








    }
}
