package day30_ReturnMethods;

import java.util.Arrays;

public class MaxMinReturnMethod {
    public static void main(String[] args) {
        int[] array = {30, -58, 900, 56, 987};
        int max = maxNum(array);
        System.out.println("Maximum number is: " + max);
        System.out.println(max > 100);
        int max2 =  max2(array);
        System.out.println("max2 = " + max2);

        int min = minNum(array);
        System.out.println("Minimum number is: " + min);
        System.out.println(min < -2);
    }

    public static int maxNum(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max)
                max = each;
        }
        return max;
    }


    public static int max2(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int minNum(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min)
                min = each;
        }
        return min;
    }

}
