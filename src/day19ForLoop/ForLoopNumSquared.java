package day19ForLoop;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoopNumSquared {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = scan.nextInt();
//
//        for (int i = num; i <= num; ) {
//            i = i * i;
//            System.out.println(num+" squared is: "+i);
//        }

        int [][] multiplicationTable = new int[10][10];

        //TODO: type your code below
        for(int i = 0; i < 10; i++){
            for(int j = 0; j< 10; j++){
                multiplicationTable[i][j] = (i+1)*(j+1);
            }
        }

        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
        System.out.println(Arrays.deepToString(multiplicationTable) ) ;

    }
}
