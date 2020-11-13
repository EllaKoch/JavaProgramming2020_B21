package day14_Switch_Recap;

public class NumberTask {
    public static void main(String[] args) {
        int n1 = 11, n2 = 17, n3 = 23;
        boolean isEven = n1 % 2 != 1;
        boolean isOdd = !isEven;

        boolean isMultipleOf5 = n3 % 5 == 0;
        int result = 0;


        if (isEven) {
            System.out.println(n1 + " is even: "+(n1 * 5));
        } else{
            System.out.println(n1 + " is odd: "+(n1 * 10));

        }
        if (isMultipleOf5) {
            System.out.println(n3 + " is multiple by 5: "+ (n3 / 5));
        } else {
            System.out.println(n3 + " is not multiple of 5: "+(n3 / 2));

        }
        if (isEven == true) {
            System.out.println("Sum of all three number is: " + (n1 + n2 + n3));
        } else {
            System.out.println("multiplication of all three numbers is: "+(n1 * n2 * n3));

        }
        if (result % 10 == 0) {
            System.out.println(result);

        } else {
            System.out.println("Invalid result");
        }
        System.out.println(result);

    }




}

/*
Given 3 numbers (int) and a boolean calculate a number based on these conditions:
    - If the first number is even, multiple it by 5, but if it's odd,
     multiple it by 10.
    - If the last number is a multiply of 5 divide it by 5,
    but if the number is not divide it by 2
    - If the given boolean is true:
        - add all the numbers together
        - After adding the numbers if the total value is divisible
         by 10 evenly then print the number, otherwise print "invalid result"
    - If the given boolean is false:
        - multiple all the numbers together
        - After multiplying the numbers, if the number is odd,
        then print it, otherwise print "invalid result"

 */