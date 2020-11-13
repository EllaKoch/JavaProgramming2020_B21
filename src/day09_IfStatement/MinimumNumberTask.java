package day09_IfStatement;

public class MinimumNumberTask {
    public static void main(String[] args) {
        int num1 = 100, num2 = 700, num3 = 50;
        boolean isNum1Min = num1 < num2 && num1 < num3;
        if (isNum1Min){
            System.out.println(num1 + " is the minimum number");
        }
        boolean isNum2Min = num2 < num1 && num2 < num3;
        if (isNum2Min){
            System.out.println(num2 + " is the minimum number");
        }
        boolean isNum3Min = num3 < num2 && num3 < num1;
        if (isNum3Min){
            System.out.println(num3 + " is the minimum number");
        }

    }
}
/*
Task04: MinimumNumber
         write a java program that accepts three numbers
          and return the minimum number
                (assume that none of them are equal)
 */