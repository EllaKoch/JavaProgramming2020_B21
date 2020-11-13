package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class UniqueAndDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

        String uniqueChars = "";
        String duplicates = "";
        for(int j = 0; j <= str.length()-1; j++){
            char ch = str.charAt(j);
            int frequency = 0;
            for(int i = 0; i < str.length(); i++ ){
                char eachChar = str.charAt(i);
                if(eachChar==ch){
                    frequency++;
                }
            }
            if(frequency==1){
                uniqueChars+=ch;
            }
            if(frequency>1 && !duplicates.contains(""+ch)){//or just use the else block for duplicates
                duplicates+=ch;
            }
        }
        System.out.println("unique characters = " + uniqueChars);
        System.out.println("duplicated characters = " + duplicates);






    }
}
