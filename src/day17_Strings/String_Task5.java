package day17_Strings;
/*
5. ask the user to enter two words. then add them together and print
            ex:
                input:
                    one
                    eight
                output:
                    oneeight
                    DO NOT use + operator
 */
import java.util.Scanner;
public class String_Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = scan.next();

        System.out.println("Enter another word");
        String word2 = scan.next();


        System.out.print(word1.concat(word2));




    }
}
