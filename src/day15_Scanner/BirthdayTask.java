package day15_Scanner;
import java.util.Scanner;
public class BirthdayTask {
    public static void main(String[] args) {
        Scanner birthday = new Scanner(System.in);

        System.out.println("Please, enter the year you were born:");
        int year = birthday.nextInt();

        System.out.println("Please, enter the month you were born:");
        int month = birthday.nextInt();

        System.out.println("Please, enter the day you were born:");
        int day = birthday.nextInt();

        System.out.println("Your date of birth is:\n"+month + "/" + day + "/" + year);
    }
}
/*
- Ask the user to enter the year, month number,
 and day (pick any datatype for the values)
 they were born and print in the following format:
    " $month / $day / $year is your birthday "

 */