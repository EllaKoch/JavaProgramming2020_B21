package day27_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfCharForEachLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();

        char letters[] = str.toCharArray();
        String unique = "";
        String result = "";
        for(char each2 : letters){
            int count = 0;
            for(char each : letters){
                if(each==each2){
                    count++;
                }
            }
            if(!result.contains(each2+"")){
                result+= "" + each2+count;
            }
        }
        System.out.println(result);
    }
}
/*
4. frequency of characters
            MUST apply for each loop
            str = "aabbbaa";
            output:
                a4b3

 */