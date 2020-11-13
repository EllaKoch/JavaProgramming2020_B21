package day22_JavaRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str = "AAAAAABBBBBBBBBBCCCCCCCCDDDDDDDDDDDDEEEEEEEEEEEEEFFFFFFFFFFFF";
        String result = ""; //"ABCDEF"

        for(int i = 0; i <= str.length()-1; i++ ){

            String eachCharacter = ""+str.charAt(i);  // A, B, B, C, C

            if(result.contains(eachCharacter)){
                continue;
            }else{ // if the character of str is not contained in the result yet, then we concate the character
                result += eachCharacter;
            }

            /*
            if(!result.contains(eachCharacter)){
                result += eachCharacter;
            }
             */

            //  result += (!result.contains(eachCharacter))? eachCharacter : "";


        }

        System.out.println("result = " + result);





    }
}
