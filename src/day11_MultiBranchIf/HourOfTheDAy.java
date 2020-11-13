package day11_MultiBranchIf;

public class HourOfTheDAy {
    public static void main(String[] args) {
        int hour = 13;// 24 hours in a day ! am/pm


        if(hour < 12 ) {
            System.out.println("Good Morning!");
        } else if (hour >= 12 && hour < 15){
            System.out.println("Good Afternoon!");
        }else if(hour >= 15){
            System.out.println("Good Evening!");
        }

    }
}
/*
Write a program to implement following logic using if-else if-else statement
1. if hour is less than 12 noon, greet with Good Morning
2. if hour is greater than or equal 12 noon but less than 3 pm,
 greet with Good Afternoon
3. if hour is greater than or equal to 3 pm, greet with Good Evening
 */