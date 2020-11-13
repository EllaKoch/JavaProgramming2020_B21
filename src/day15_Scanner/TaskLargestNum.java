package day15_Scanner;
import java.util.Scanner;
public class TaskLargestNum {
    public static void main(String[] args) {
        Scanner bigNum = new Scanner(System.in);
        System.out.println("Please enter 3 numbers\nEnter the first number");
        byte n1 = bigNum.nextByte();
        System.out.println("Enter the second number");
        byte n2 = bigNum.nextByte();
        System.out.println("Enter the third number");
        byte n3 = bigNum.nextByte();
        System.out.println("Thank you!");

        if(n1>n2&&n1>n3){
            System.out.println("The biggest number from "+n1 +", " + n2 +" and " + n3 + " is " +n1);
        }else if(n2>n1&&n2>n3){
            System.out.println("The biggest number from "+n1 +", " + n2 +" and " + n3 + " is " +n2);
        }else{
            System.out.println("The biggest number from "+n1 +", " + n2 +" and " + n3 + " is " +n3);
        }

    }
}/*
Ask user to enter three numbers.
 Print the biggest number from the entered numbers
    Ex:
    Input: 3,6,4
    Output: The biggest number from 3,6, 4 is 6

 */