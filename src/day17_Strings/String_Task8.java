package day17_Strings;// 100%
/*
8. write a program that asked the user to enter the number
 of babies they are having and print a message:
        0: "Sorry"
        1: "Congratulations"
        2: "Wow Twins"
        3: "Wow. Triplets!"
        4, 5, 6: "Unbelievable, $umberOfBabies babies!"
        Any other: "I don't believe you"
 */

import java.util.Scanner;

public class String_Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many babies you are expecting:");
        short numOfBabies = scan.nextShort();

        switch (numOfBabies) {
            case 0:
                System.out.println("Sorry");
                break;
            case 1:
                System.out.println("Congratulations!");
                break;
            case 2:
                System.out.println("Wow Twins!");
                break;
            case 3:
                System.out.println("Wow. Triplets!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Unbelievable, " + numOfBabies + " babies!");
                break;
            default:
                System.out.println("I don't believe you");
        }
    }
}
