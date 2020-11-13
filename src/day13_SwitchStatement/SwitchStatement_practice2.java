package day13_SwitchStatement;

public class SwitchStatement_practice2 {
    public static void main(String[] args) {

        int n = 15;
        String day = "";//declared day = ""; to make it reusable


        switch (n){


            case 1:
                day = "Monday";
                break;
            case 2:
              day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";

            case 6:
               day = "Saturday";
                break;
            case 7:
               day = "Sunday";
                break;
            default:
                day = "Invalid data";
                break;//not necessary to give break since its the end of switch.

        }

        System.out.println(day);
    }
}


