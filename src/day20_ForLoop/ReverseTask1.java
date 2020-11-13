package day20_ForLoop;
import java.util.Scanner;
/*
. write a program that can reverse any given string
            ex:
                input: abcd
                output: dcba
                input: Cybertek
                output: ketrebyC

 */
public class ReverseTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        for(int i = word.length()-1;i >=0; i-- ){
            System.out.print(word.charAt(i));
        }
    }
}
