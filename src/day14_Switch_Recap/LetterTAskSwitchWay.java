package day14_Switch_Recap;

public class LetterTAskSwitchWay {
    public static void main(String[] args) {
        char letter = '[';
        String type = "";
        switch(letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'z':
                type = "lowercase";
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z': type = "uppercase";
            break;

            default:
                type = ("Invalid character");



        }
        System.out.println(type);


    }
}
/*

Given a letter (char) determine if the character is an uppercase letter or lowercase letter
    Ex: 'b'  --> lowercase
        'G'  --> uppercase
        'O'  --> uppercase

 */