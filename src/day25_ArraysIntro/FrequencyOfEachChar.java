package day25_ArraysIntro;

import java.util.Scanner;

/*
Assignments:
    1. write a program that can find the frequency of each characters from a string
            str = "ababcaa";
                    // nonDup =  "abc"  a b c
                      //     frequency: 4 2 1
            output:
                a4b2c1
 */
public class FrequencyOfEachChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or a sentence");
        String str = scan.nextLine();//"ababcaa";
        String result = "";

        for(int j  = 0; j<str.length(); j++) {
            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {//if each character in str == to one of each character in str, add  to the frequency.
                    frequency++;
                }
            }
            if(!result.contains(""+ch)){
                result += ch+""+frequency;
            }

        }

        System.out.println(result);



    }
}

