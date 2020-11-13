package day25_ArraysIntro;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
                    //     0        1       2   3       4      5
        System.out.println("Enter the number: ");
        int num = scan.nextInt();//1

        System.out.println(month[num-1]);









    }
}
