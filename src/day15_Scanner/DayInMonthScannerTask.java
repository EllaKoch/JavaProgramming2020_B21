package day15_Scanner;
import java.util.Scanner;
public class DayInMonthScannerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of a month from 1 to 12");
        int month = scan.nextInt();

        System.out.println("Enter a year");
        int year = scan.nextInt();

        if (month >= 1 && month <= 12) {
            if (month == 2){
                if (year % 4 == 0) {
                    System.out.println("This month has 29 days");
                } else {
                    System.out.println("This month has 28 days");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("This month has 30 days");
            } else {
                System.out.println("This month has 31 days");
            }
        } else {
            System.out.println("Please enter a valid number of a month: 1~12");
        }
    }
}
/*
- Recreate the task which tells the user how many days are in a given month (day 13). Accept a month (number) and year from the console and print how many days are in that specific month. Handle leap years. Try to redo this task without looking at the previous code.
 */