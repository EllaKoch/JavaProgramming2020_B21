package day25_ArraysIntro;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter day of the week: ");
        int num = scan.nextInt();

        String[] nameOfDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Today is: " + nameOfDay[num-1]);









    }
}
