package day17_Strings;

public class String_CharAt {
    public static void main(String[] args) {

        String str = "Cybertek";//index starts from 0 to 7

        System.out.println(str.charAt(0));

        char second = str.charAt(1);
        System.out.println(second);

        char last = str.charAt(7);
        System.out.println(last);

        System.out.println(str.charAt(100));// this is out of bounds

    }
}
