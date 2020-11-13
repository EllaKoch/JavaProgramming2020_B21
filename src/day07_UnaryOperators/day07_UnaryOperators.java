package day07_UnaryOperators;

public class day07_UnaryOperators {
    public static void main(String[] args) {
        int year = 2020;
        boolean isLeapYear = year % 4 < 1;//checks if year is evenly divisible by 4
          //   0 < 1===> true
        System.out.println(year + " is leap year: " + isLeapYear);







    }
}
/*
Warm Up tasks:
    1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020
            output:
                2020 is leap year: true
                year = 2021
            output:
                2021 is leap year: false
                >, <
                2020 % 4  < 1
        Hint: if the number of year can be evenly divisible by 4, it's known as leap year
    2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
Unary Operators:
        -: negative
        +: positive (implicit)
        --:
        ++:

 */