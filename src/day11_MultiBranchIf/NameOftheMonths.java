package day11_MultiBranchIf;

public class NameOftheMonths {
    public static void main(String[] args) {
        int num = 12; //1 - 12 months
        String monthName = "";

        if (num == 1){
            monthName = "January";
        }else if (num == 2){
            monthName = "Febuary";
        }else if (num == 3){
            monthName = "March";
        }else if (num == 4){
            monthName = "April";
        }else if (num == 5){
            monthName = "May";
        }else if (num == 6){
            monthName = "June";
        }else if (num == 7){
            monthName = "July";
        }else if (num ==8){
            monthName = "August";
        }else if (num == 9){
            monthName = "September";
        }else if (num == 10){
            monthName = "October";
        }else if (num == 11){
            monthName = "November";
        }else{
                monthName = "December";
            }

        System.out.println(monthName );

    }
}
