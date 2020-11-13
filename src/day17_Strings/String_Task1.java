package day17_Strings;
/*

    1. write a program that ask user to enter sentence.
        then print out the first and last characters

 */
import java.util.Scanner;
public class String_Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

        //System.out.println(sentence.charAt(0)+""+sentence.charAt(sentence.length()-1));
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));



//redo

//        String f = sentence.substring(0,1);
//        String l = sentence.substring(sentence.length()-1);
//        System.out.println(f+"."+l);

    }
}
