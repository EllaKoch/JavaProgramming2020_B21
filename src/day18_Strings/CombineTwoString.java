package day18_Strings;

import java.util.Scanner;

public class CombineTwoString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();

        scan.close();

        if(s1.charAt(s1.length()-1) == s2.charAt(0)){//if last character of s1 equal to first character of s2
            System.out.println(s1 + s2.substring(1));
        }else{
            System.out.println(s1+ s2);
        }

        System.out.println("=========================================================");
        if(s1.endsWith( s2.substring(0,1))){//if s1 ends with the first character of s2
            System.out.println(s1 + s2.substring(1));
        }else{
            System.out.println(s1 + s2);
        }

    }
}
