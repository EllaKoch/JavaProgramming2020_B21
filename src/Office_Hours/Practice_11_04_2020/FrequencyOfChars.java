package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

        String result = "";

        for(int j = 0; j<= str.length()-1; j++){
            char ch = str.charAt(j);
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i)==ch){
                    count++;
                }
            }
            if(!result.contains(""+ch)){//or without ! ==> continue;
                result+=""+ch + count;
            }
        }
        System.out.println(result);










    }
}
