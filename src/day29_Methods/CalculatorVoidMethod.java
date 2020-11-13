package day29_Methods;

public class CalculatorVoidMethod {
    public static void main(String[] args) {
        calculator(5.5, 5.6, '*');
    }

    public static void calculator(double n1, double n2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '%':
                result = n1 % n2;
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        System.out.println(result);
    }


}
