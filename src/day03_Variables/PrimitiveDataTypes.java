package day03_Variables;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        //score 85 (can use either byte/short/int/long)
        int score = 85;
        System.out.println(score);
        System.out.println("Score = "+ score);

        /* In Java int is preffered. you gotta put l or L at the end of number,
        so compiler takes it as long instad of int/*
         */
        long number1 = 9999999999L;

        double decimal1 = 0.5;
        //same thing here. double is preffered in java ,
        // so put F at the end of the number.
        float float2 = 0.5F;
        System.out.println(float2);

        /*in future:
                    for integers:int
                    for decimals: double

         */



    }
}



