package Office_Hours.Practice_10_28_20;

import java.util.Scanner;

public class FrequencyOfACharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();//abaac

        char ch = 'a';
        int count = 0;//1 + 1+ 1 = 3

        for(int i = 0; i < str.length(); i++){
            char eachChar = str.charAt(i);//a, b, a, a, c

            if(eachChar == ch){
                        // a
                count++;
            }
        }

        System.out.println("Frequency of 'a' is: " + count);




    }
}
