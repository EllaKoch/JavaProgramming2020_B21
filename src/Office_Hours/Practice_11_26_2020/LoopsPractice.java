package Office_Hours.Practice_11_26_2020;

public class LoopsPractice {
    public static void main(String[] args) {
        //print nums from 1-50 on the same line

        System.out.print("All numbers: ");
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // print Even number
        System.out.print("Even number: ");
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //print Odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // print Even numbers using an if condition
        System.out.print("Even numbers: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0)// if i is odd, skip it
                continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // print Odd numbers using if condition and if i==29 stop the iteration
        System.out.print("Odd numbers: ");
        for (int i = 1; i <= 50; i++) {

            if (i % 2 == 0) {// if i is even, skip it
                continue;
            }
            System.out.print(i + " ");
            if (i == 29) {
                break;  // exits the loop
            }

        }
        System.out.println();

        System.out.println("Hello");// if on line 45 i used return instead
                                    // of break Hello would not be executed
                                    // because return exits the whole method

    }
}
