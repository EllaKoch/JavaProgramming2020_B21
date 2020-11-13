package day11_MultiBranchIf;

public class DaysInAWeekTernary {
    public static void main(String[] args) {
//ternary way
        int n = 7;
        String nameOfDays = "";

        nameOfDays = (n == 1) ? "Monday" : (n == 2)? "Tuesday" : (n == 3)? "Wednesday"
                : (n ==4) ? "Thursday" :(n == 5)? "Friday"
                : (n == 6) ? "Saturday" : "Sunday";

        System.out.println(n + " is " + nameOfDays);







    }
}
