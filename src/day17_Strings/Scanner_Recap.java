package day17_Strings;
import java.util.Scanner;
public class Scanner_Recap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number from 1 - 10");
        byte num = input.nextByte();//accept byte value

        if (num>0 && num <11) {//makes sure the number is within the range

            System.out.println("Can you enter that number as a word");
            String word = input.next();//accept one word

            boolean areMatching = false;
            switch (word) {
                case "one":
                    areMatching = (num == 1);
                    break;
                case "two":
                    areMatching = (num == 2);
                    break;
                case "three":
                    areMatching = (num == 3);
                    break;
                case "four":
                    areMatching = (num == 4);
                    break;
                case "five":
                    areMatching = (num == 5);
                    break;
                case "six":
                    areMatching = (num == 6);
                    break;
                case "seven":
                    areMatching = (num == 7);
                    break;
                case "eight":
                    areMatching = (num == 8);
                    break;
                case "nine":
                    areMatching = (num == 9);
                    break;
                case "ten":
                    areMatching = (num == 10);
                    break;
            }


            if (areMatching) {
                System.out.println("Number: " + num);
                System.out.println("Word: " + word);
            } else {
                System.out.println("The two inputs do not match");
            }

        }else{
            System.out.println(num + " was not between 1 - 10 ");
        }

            input.close();

    }
}
