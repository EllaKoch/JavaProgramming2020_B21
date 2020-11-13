package day18_Strings;
import java.util.Scanner;
/*
 4. Ask user to enter two words. Then add them together and print.
  But if the last letter of the first word and the first letter of the last word
  is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word1 = scan.next();

        System.out.println("Enter another word:");
        String word2 = scan.next();

        if(word1.charAt(word1.length()-1)== word2.charAt(0)){
            System.out.println(word1.concat(word2.substring(1)));
        }else{
            System.out.println(word1.concat(word2));
        }
            //or
//        if(word1.endsWith(String.valueOf(word2.charAt(0)))){
//            System.out.println(word1+word2.substring(1));
//        }else{
//            String wordsConcat = word1.concat(word2);
//            System.out.println(wordsConcat);
//        }

    }
}
