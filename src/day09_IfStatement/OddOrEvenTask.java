package day09_IfStatement;

public class OddOrEvenTask {
    public static void main(String[] args) {
        /*
        int number = 100;

        boolean even = number % 2 < 1;
        if(even){
            System.out.println("100 is even number");
        }

         int number2 = 101;
         boolean odd = number2 % 2 >= 1;

        if (odd){
            System.out.println("101 is odd number");
        }

         */

        int number  = 1000;

        boolean even = number % 2 == 0;

        if (even){
            System.out.println( number + " is even number");
        }
        if (!even){
            System.out.println(number +" is odd number");
        }
    }
}
