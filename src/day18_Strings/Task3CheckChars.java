package day18_Strings;
import java.util.Scanner;
/*
 3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
                java
            output:
                not same

 */
public class Task3CheckChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine().toLowerCase();

        String first = word.substring(0,1);
        String last = word.substring(word.length()-1);

        if(first.equals(last)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
//
//        if( word.charAt(0)==(word.charAt(word.length()-1))){
//            System.out.println("same");
//        }else{
//            System.out.println("not same");
//        }



    }
}
