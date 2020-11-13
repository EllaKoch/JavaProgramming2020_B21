package day14_Switch_Recap;

public class DaysInMonths {
    public static void main(String[] args) {
        int year = 2021;
        String month = "Febuary";
        String result = "";

        switch(month){

            case"January": result = "31 days";
            break;

            case "Febuary": result = (year%4 ==0)? "29 days" : "28 days";
            break;

            case "March": result = "31 days";
            break;

            case "April": result = "30 days";
            break;

            case "May": result = "31 days";
            break;

            case "June": result = "30 days";
                break;

            case "July": result = "31 days";
                break;

            case "August": result = "31 days";
                break;

            case "September": result = "30 days";
                break;

            case "October": result = "31 days";
                break;

            case "November": result = "30 days";
                break;

            case "December": result = "31 days";
                break;


            default:
                result = "Invalid";//last block does not need break statement
        }

        System.out.println(result);


    }
}
/*
1. use swithc statement to write a program that can return the number of days based on the name of the month
    Ex:
        year = 2020;
        month = Mar;
        output:
            31 days
        year = 2020;
        month = Feb;
        output:
            29  days
        DaysInMonth

 */