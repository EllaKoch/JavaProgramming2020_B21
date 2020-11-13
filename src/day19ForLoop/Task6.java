package day19ForLoop;
import java.util.Scanner;
/*

    6. ask the user to enter a word.
        if the word ends with "ly", print "really???"
        otherwise, print "never mind"

 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        word = ((word.endsWith("ly"))? "really???" : "never mind");
        System.out.println(word);
//
//
//        if(word.endsWith("ly")){
//            System.out.println("really???");
//        }else{
//            System.out.println("never mind");
//        }





    }
}
