package day18_Strings;

public class StringMethods4 {
    public static void main(String[] args) {
        //isEmpty, equals, equalsIgnoreCase, contains, startsWith, endsWith

        //isEmpty:
        String str = "Hello Everyone";

        System.out.println(str.isEmpty());

        String str2 = "";

        System.out.println(str2.isEmpty());

        //contains method:

        String sentence = "I like to learn Java";

        System.out.println(sentence.contains("C#"));// returns false

        System.out.println(sentence.contains("Java"));//true

        String webAddress = "www.amazon.com";

        boolean validAddress = webAddress.startsWith("www") && webAddress.endsWith(".com");

        System.out.println(validAddress);//true




    }
}
