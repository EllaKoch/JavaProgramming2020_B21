package day22_JavaRecap;

import java.util.Scanner;

public class DivideTwoNumbersForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();//10
        int b = scan.nextInt();//2
        scan.close();

        int count = 0;

        for(count = 0; a >= b; count++){// count ==> 1 2 3 4 5
            a-=b;//8 6 4 2 0
        }
        System.out.println(count + " with a remainder of " + a);












    }
}
