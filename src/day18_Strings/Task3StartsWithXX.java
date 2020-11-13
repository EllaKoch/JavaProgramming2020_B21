package day18_Strings;
import java.util.Scanner;
/*
 3.  Ask user to enter a word. If the first or second or both letter of the word is x,
  print the word without x(s). If x is the third letter it should be printed.
  If the first and second are x, both should be ignored.
                    Input:
                        xxode
                    Output:
                        ode
                    Input:
                        oxidex
                    Output:
                           oidex
 */
public class Task3StartsWithXX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

         if(word.charAt(0) == 'x'&& word.charAt(1) == 'x'){
            word = word.substring(2);
            System.out.println(word);
        }else if(word.charAt(0)=='x'){
            word = word.substring(1);
            System.out.println(word);
        }else if(word.charAt(1)=='x'){
             word = word.charAt(0) + word.substring(2,word.length());
             System.out.println(word);
         }else{
             System.out.println(word);
         }

    }
}
