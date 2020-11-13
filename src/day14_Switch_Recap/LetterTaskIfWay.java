package day14_Switch_Recap;

public class LetterTaskIfWay {
    public static void main(String[] args) {
        char letter = '[';
        String message = "";

        if (letter >= 'A' && letter <= 'Z'){
            message = "uppercase";


        }else if(letter >= 'a' && letter <='z'){
            message = "lowercase";
        }else{
            message = "Invalid character";

        }

        System.out.println(message);

    }
}
/*
Given a letter (char) determine if the character is an uppercase letter or lowercase letter
    Ex: 'b'  --> lowercase
        'G'  --> uppercase
        'O'  --> uppercase

 */