package day29_Methods;

import java.util.Arrays;

public class CombineArraysVoidMethod {
    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5,};
        int[] a2 = {6, 7, 8, 9, 10, 11, 12, 13};

        combineArrays(a1, a2);

    }

    public static void combineArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] += arr1[i];
        }

        for (int each : arr2) {
            arr3[j++] = each;
        }

        System.out.println(Arrays.toString(arr3));

    }


}
