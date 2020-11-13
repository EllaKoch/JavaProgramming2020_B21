package Office_Hours.Practice_10_28_20;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();//abab

        String nonDup = "";
        String eachChar = "";

        for (int i = 0; i <str.length(); i++){
            eachChar = ""+ str.charAt(i);
            if(nonDup.contains( eachChar )){
               continue;
            }else{
                nonDup += str.charAt(i);
            }

        }

        System.out.println(nonDup);





    }
}
