package day14_Switch_Recap;

public class Ternary_Practice {
    public static void main(String[] args) {

        int num = 100;
        String result = (num % 2 != 0) ? "Odd number" : "Even number";

        System.out.println(result);

        String result2 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println(result2);

        int n = 4;  //1 ~7
        if (n >= 1 && n <= 7) {
            String day = (n == 1) ? "Monday" : (n == 2) ? "Tuesday"
                    : (n == 3) ? "Wed" : (n == 4) ? "Thursday"
                    : (n == 5) ? "Fri" : (n == 6) ? "Saturday" : "sunday";
            System.out.println(day);

        } else {
            System.out.println("Invalid");
        }

    }
}
