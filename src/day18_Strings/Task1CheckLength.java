package day18_Strings;
import java.util.Scanner;
/*
    1. write a program that can return the longest string from two user inputs

 */
public class Task1CheckLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence1 = scan.nextLine();

        System.out.println("Enter another sentence:");
        String sentence2 = scan.nextLine();

        if(sentence1.length()>sentence2.length()){
            System.out.println("The first sentence is longer: "+sentence1);
        }else if(sentence1.length()==sentence2.length()){
            System.out.println("Both are same length");
        }else{
            System.out.println("The second sentence is longer: "+sentence2);
        }




    }
}
