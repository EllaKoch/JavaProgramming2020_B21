package day09_IfStatement;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 1000;
        boolean even = number % 2 == 0;
        boolean odd = !even;

        System.out.println(1000 + " is even number: " + even);

        System.out.println(1000 + " is odd number: " + odd);

        System.out.println("================================");

        int n = 200;

        boolean isPozitive = n > 0;
        boolean isNegative = n < 0;
        boolean isZero = !isPozitive && !isNegative;
        System.out.println(n + " is positive: " + isPozitive);
        System.out.println(n + " is negative:" + isNegative);
        System.out.println(n + " is zero: " + isZero);

        System.out.println("====================================");

        System.out.println(false == !true );//returns true

        System.out.println(false != true && !false == true);

                            // true && true ==> true
        System.out.println(!false != false || false);
                            // true != false ==> true

        System.out.println(!false != false && false);
                                    //false

        System.out.println( false || false || false || true);
                                    //true

        System.out.println(true && true && true && false);
                                    //false

        System.out.println("================================");

        String weather = "Shiny";
        int degree = 70;

        boolean r1 = (weather == "Rainy" || degree ==70);
        //              !( "shiny" == "Rainy || 70 == 70)
        //              !( false || true)
        //              ! true
        //               false

        System.out.println(r1);
        /*
        !no ==> yes
        !yes ==> no

        !funny => not funny

         */

        System.out.println(!!true); //true
        System.out.println(!!false);//false
        System.out.println(!!!false);//true
        System.out.println(!!!!false);//false

    }
}
