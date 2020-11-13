package day09_IfStatement;

public class MaximumNumberTask {
    public static void main(String[] args) {
        int num1 = 400;
        int num2 = 700;
        int num3 = 800;

        boolean isNum1Max = num1 > num2 && num1 > num3;

        if(isNum1Max){
            System.out.println(num1 + " is the maximum number");
        }
        boolean isNum2max = num2 > num1 && num2 > num3;
        if (isNum2max){
            System.out.println(num2 + " is the maximum number");
        }

        //boolean isNum3Max = num3 > num1 && num3 > num2;
        //if(isNum3Max){ ==>sout

        if (num3>num1&&num3>num2){
            System.out.println(num3 + " is the maximum number");
        }



    }
}
/*
Task03: MaximumNumber
         write a java program that accepts three numbers
         and return the maximum number
                (assume that none of them are equal)

 */