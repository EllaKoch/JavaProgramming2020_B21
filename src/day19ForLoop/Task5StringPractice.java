package day19ForLoop;
/*
5. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
import java.util.Scanner;
public class Task5StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = scan.nextLine();
        scan.close();

        if(word.isEmpty()){
            System.out.println("String is empty");
        }else if(word.length()> 3){
            System.out.println(word.substring(word.length()-3));
        }else{
            System.out.println(word);
        }




    }
}
