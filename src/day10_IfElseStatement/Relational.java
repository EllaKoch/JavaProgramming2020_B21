package day10_IfElseStatement;

public class Relational {
    public static void main(String[] args) {

        System.out.println( 10 > 100);// false

        System.out.println(100 < 10);// false

        System.out.println( 10000 > 10);// true

        System.out.println(20 < 10000);// true

        System.out.println( 10 >= 8); // greater or equal ==> true

        System.out.println(9 >= 9);// true, cause 9 = 9

        System.out.println(10 <=10 ); // ==> true

        System.out.println(10 <= 5);// false

        // == :   compare

        int a1 = 20;
        int a2 = 30;
        int a3 = 30;

        System.out.println(a1 == a2);// false
        System.out.println(a2 == a3);// true

        char ch1 = '!';
        char ch2 = '!';

        System.out.println(ch1 == ch2); // true

        String laguage1 = "Turkish";
        String languge2 = "Indian";
        String language3 = "turkish";

        System.out.println(laguage1 == languge2);// false
        System.out.println(laguage1 == language3);// false

        System.out.println("Russian" == "English");// false

    // != : NOT equal

        System.out.println("Russian language" == "Japanese Language");// false
        System.out.println("Russian language" != "Japanese Language");// true

        System.out.println(20 != 20);// false

        System.out.println('a' != 'A');// true







    }
}
