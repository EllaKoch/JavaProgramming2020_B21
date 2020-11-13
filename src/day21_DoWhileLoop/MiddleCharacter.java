package day21_DoWhileLoop;
public class MiddleCharacter {


    public static void main(String[] args) {

        String word = "cybertek";

        //            "javav" // 5/2=2

        if(word.length() % 2 !=0) {

            // first req
            if (word.length() >= 3) { // if it has 3 or more characters
                System.out.println( word.charAt(word.length()/2) );
            }else{  // has 1 char only
                System.out.println(word + word + word);
            }

        }else{ // even number of characters
            // "java" ==> av ==> 1, 2
            // "apples" ==> pl ==> 2, 3
            // "cybertek"==>er ==> 3, 4(length/2)

            if(word.length()>= 4){  // has more than 4 chars
                int m = word.length()/2;
                System.out.println(word.charAt(m-1) +""+ word.charAt(m));
            }else{ // for 2 chars
                System.out.println(word+word);
            }


        }
    }
}
/*

 */