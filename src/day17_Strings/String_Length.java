package day17_Strings;

public class String_Length {
    public static void main(String[] args) {
        String s = "Rutotukghgvfkfkhfjhikjoewrytipryryuflknvcskjh";
        String s2 = "word";

        System.out.println(s.length());//45
        System.out.println(s2.length());//4
        int len = s.length();

        System.out.println(len == s2.length());//false
        System.out.println(len == s.length());//true

    }
}
