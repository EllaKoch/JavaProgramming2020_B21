package day09_IfStatement;

public class MaximumMinimum {
    public static void main(String[] args) {
        // task to find maximum
        int n1 = 200;
        int n2 = 200;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;

        if (n1IsMax){
            System.out.println(n1 + " is maximum");

        }
        if (n2IsMax){
            System.out.println(n2 + " is maximum");
        }

        // task ro find minimum
        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;

        if (n1IsMin){
            System.out.println(n1 + " is minimum");

        }
        if (n2IsMin) {
            System.out.println(n2 + " is minimum");
        }
            // for equal:
            boolean equal = !n1IsMax && !n2IsMax;
            if (equal){
                System.out.println("both are equal");
            }

    }

}
/*

    2. write a program that can print out the maximum number between two numbers
        Ex:
            num1 = 20;
            num2 = 30;
            output:
                30 is the maximum number
            num1 = 20;
            num2 = 20;
            output:
                both numbers are equal

 */