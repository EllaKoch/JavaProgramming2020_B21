package day11_MultiBranchIf;

public class LargestNumber {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 300;
        int num3 = 400;

        int max = 0;

        if (num1 > num2 && num1 > num3){
            max = num1;
        }else if (num2 > num1 && num2 > num3){
            max = num2;
        }else{
            max = num3;
        }
        System.out.println(max + " is the largest number");


    }
}
/*
1. Program :
• Declare 3 numbers
• Program should display which one is largest
2. Write a Java Program for the following logic:
§ If marks < 60, then print “Fail”
§ If marks >= 60, but less than 90, then print “Pass”
§ If marks >= 90, then print “Passed with Distinction”
 */