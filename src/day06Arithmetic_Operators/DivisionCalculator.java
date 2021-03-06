package day06Arithmetic_Operators;

public class DivisionCalculator {
    public static void main(String[] args) {

        devides(5,0);

        divide(-50,-30);

        int num1 = 10, num2 = 3;
        int total = num1/num2;
        //System.out.println("10 divided by 3 equals to " + total + " with a remainder of 1");
        int remainder = num1%num2;
        System.out.println(num1+ " divided by " + num2 + " equals to " + total +" with a remainder of "+remainder);

        int num3 = 20, num4 = 6;
        int total1 = num3/num4;
        int remainder1 = num3%num4;
        System.out.println(num3 +" divided by " + num4 + " equals to " + total1 + " with a remainder of " + remainder1);

        int num5 = 100, num6 = 20;
        int total2 = num5/num6;
        int remainder2 = num5%num6;
        System.out.println(num5 + " devided by " + num6 + " equals to "+ total2 + " with the remainder of "+ remainder2);


/*
Task: DivisionCalculator

        write a program that can calculate first number by second number, and print out the result
            num1 = 10;
            num2 = 3;
            output:
                10 divide by 3 is equal to 3 with a remainder of 1
            num1 = 20
            num2 = 6
            output:
                 20 divide by 6 is equal to 3 with a remainder of 2
            num1 = 100;
            num2 = 20;
            output:
                 100 divide by 20 is equal to 5 with a remainder of 0

         */

    /*
        int num1 = 10;
        int num2 = 3;
        int a = num1/num2;
        int b  = num1%num2;

        System.out.println(num1 + " divided by " + num2 + " is equal to " + a + " with a remainder of " + b + ".");
       */



    }


    public static void devides(int num1, int num2) {

        if(num2==0) {

            System.out.println("Invalid Number");

            return;

        }

        System.out.print(num1 +" divided by "+num2 +" is: ");

        int count =0;

        while(num1 >= num2) {

            num1 -= num2;

            count++;

        }

        System.out.println(count+" and remainder is "+num1);

    }



    public static void divide(int a, int b){
        if(b==0){
            System.out.println("Invalid divisor");
            return;
        }
        System.out.print(a +" divided by "+b +" is: ");

        int result = 0; //  1+1 =   2
        while(a>=b){ // 4 > 2
                    //  2 = 2
                    //  0 !=2
            a-=b;//  a =  4-2 = 2
                //   a =  2-2 = 0
            result++;// 1, 1
        }
                        //  2                             // 0
        System.out.println(result+" with the remainder of "+ a);


    }

}
