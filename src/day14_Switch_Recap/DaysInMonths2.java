package day14_Switch_Recap;

public class DaysInMonths2 {
    public static void main(String[] args) {
       int year = 2020;
       String month = "Febuary";

       String result = "";

       switch(month){
           case "Febuary": result = (year%4==0)? "29 days" : "28 days";
           break;

           case "April":
           case "June":
           case "September":
           case "November":result = "30 days";
           break;

           case "January":
           case "March":
           case "May":
           case "July":
           case "August":
           case "October":
           case "December": result = "31 days";
           break;

           default: result = "Invalid";

       }
        System.out.println(result);
    }
}
/*
result: 28, 29, 30, 31, invalid
        cases: 2 ==> 28 or 29 days
        cases: 4,6,9,11 ==> 30 days
        cases: 1, 3, 5, 7, 8, 10, 12 ==> 31 days
        default: Invalid
        || we cannot use in the switch or case, but we can apply or logic in switch by declaring the cases back to back without break statement

 */