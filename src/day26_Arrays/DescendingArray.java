package day26_Arrays;

import java.util.Arrays;

/*
1. write a program that cna sort an array of integers in descending
                int[] arr = {5,1,2,6,7, 0};
                output:
                    7 6 5 2 1 0
                    output:
                        [7, 6, 5, 2, 1, 0]

 */
public class DescendingArray {
    public static void main(String[] args) {
       int[] arr = {5, 1, 2, 6, 7, 0};

        Arrays.sort(arr);  // finish sorting in ascending order

        System.out.println( Arrays.toString(arr) ); // [0, 1, 2, 5, 6, 7]
        //  0  1  2  3  4  5

        int[] descending = new int[arr.length]; // [7, 6, 5, 2, 1, 0]

        for(int i =arr.length-1, j = 0;   i >= 0 ;  i--, j++ ){ // i:

            descending[j]= arr[i];
            /*
                         j        i
              descending[0] = arr[5] =7;
              descending[1] = arr[4] =6;
              descending[2] = arr[3] =5;
              descending[3] = arr[2] =2;
             descending[4] = arr[1] =1;
             descending[5] =  arr[0] = 0;
             */

        }

        System.out.println(  Arrays.toString(descending)  );

/*
unique
frequency
descending order
 */


    }
}