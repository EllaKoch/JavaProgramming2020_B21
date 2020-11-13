package day13_SwitchStatement;

public class DaysInAMonth {
    public static void main(String[] args) {

        //precontdition months: 1~12;
        //days; 28,28,30,31

        int year = 2021;
        int month = 2; //1~12

        String result = "";


        boolean has28Or29Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has31Days = !has28Or29Days || !has30Days;//not necessery


        if (month >= 1 && month <= 12) {

            if (month == 2) { // for Feb
                if (year % 4 == 0) {//leap year => 28 days
                    result = "29 days";
                } else {//not leap year ==> 29 days
                    result = "28 days";
                }
            } else if (has30Days) {// for april, june, september, november
                result = "30 days";
            } else {// if the months are none of the above==>Jan, Mar, May, Jul,Aug,Oct, Dec.
                result = "31 days";
            }

        } else {//if the precondition is invalid
            result = "Invalid month";
        }
        System.out.println(result);


    }
}
/*
1. write a program that can find the number of days in a month
                    Note: MUST USE NESTED IF

 */