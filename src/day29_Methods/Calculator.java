package day29_Methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        calculator(scan.nextDouble(), scan.next().charAt(0), scan.nextDouble());

        calculator(20, '*', 2);

    }

    public static void calculator(double n1, char operator, double n2) {
        int result = 0;
        boolean isValid = operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%';

        if (isValid) {

            switch (operator) {
                case '+':
                    result += (int) n1 + n2;
                    System.out.println(result);
                    //System.out.println("Addition: " + (n1 + n2));
                    break;
                case '-':
                    System.out.println("Subtraction: " + (n1 - n2));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (n1 * n2));
                    break;
                case '/':
                    System.out.println("Division: " + (n1 / n2));
                    break;
                default:
                    System.out.println("Remainder: " + (n1 % n2));
                    break;

            }


        } else {
            System.err.println("Invalid Operator");
        }

    }


}
