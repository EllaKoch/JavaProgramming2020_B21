package day17_Strings;
/*
4. write a program that asks user to enter two string
            then print the longest string

 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class String_Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String firstSentence = scan.nextLine();

        System.out.println("Enter the second sentence");
        String secondSentence = scan.nextLine();

        if(firstSentence.length()>secondSentence.length()){
            System.out.println(firstSentence);
        }else{
            System.out.println(secondSentence);
        }

    }
}
