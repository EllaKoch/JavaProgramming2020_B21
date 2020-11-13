package day16_Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CalculatorTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1:");
        double num1 = input.nextDouble();//accepting number 1

        System.out.println("Enter number 2:");
        double num2 = input.nextDouble();//accepting number 2

        System.out.println("Enter the operator:");
        String operator = input.next();//accepting the operator

        input.close();//closing scanner because we have all the inputs

        double result = 0;
        boolean isValid = true;


        switch (operator){
            case "Plus":
            case "plus":
            case "+":
                result = num1+num2;
                break;
            case "minus":
            case "-":
                result = num1-num2;
                break;
            case "x":
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            case "%":
                result = num1%num2;
                break;
            default:
                System.out.println(operator+" is an invalid operator");
                isValid = false;

        }


        if(isValid){// to print only if the entered operator is valid
            System.out.println(num1 +" " + operator +" " + num2 + " = " + result);
        }

    }

}
