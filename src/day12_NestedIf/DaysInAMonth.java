package day12_NestedIf;

public class DaysInAMonth {
    public static void main(String[] args) {
        int month = 12;
        String days = "";

        if(month >=1 && month <= 12){

            if(month == 2 ){
                days = "28";
            }else if(month == 4 || month == 6 || month == 9 || month == 11){
                days = "30";
            }else{
                days = "31";
            }
            System.out.println("The month you entered has: " + days);

        }else{
            System.out.println("There are only 12 months in a year");
        }

    }

}
/*
 2. write a program that can find the number of days in a month
 */

/*

        int month = 9;//1~12
        int days = 0;
        boolean has28Days = month == 2;
        boolean has30days = month == 4||month == 6|| month == 9|| month == 11;

        if(month >= 1 && month <= 12){


            days = (has28Days)? 28 : (has30days)? 30 : 31;

            System.out.println("The month you entered has: " + days + " days");

        }else{
            System.out.println("There are only 12 months in a year");
        }

 */