package day31_MethodOverLoading;

import java.util.Arrays;
// sort double array, char array, string array, int array in descending order
public class MethodOverloading4 {
    public static void main(String[] args) {
        String[] arr = {"apple", "zapple"};
        System.out.println(Arrays.toString(sort(arr)));

        char[] arr1 = {'a','f','x'};
        System.out.println(Arrays.toString(sort(arr1)));

        double[] arr3 = {1.2, 3.4, -4.5};
        System.out.println(Arrays.toString(sort(arr3)));
    }

    public static int[] sort(int[] arr) {// {2,1,3}
        Arrays.sort(arr);// {1,2,3}
        int[] reversedArray = new int[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }
   /*
   sorts the array of  String in descending order, returns it as an array
    */
    public static String[] sort(String[] arr) {// {2,1,3}
        Arrays.sort(arr);// {1,2,3}
        String[] reversedArray = new String[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

    /*
   sorts the array of char in descending order, returns it as an array
    */
    public static char[] sort(char[] arr) {// {2,1,3}
        Arrays.sort(arr);// {1,2,3}
        char[] reversedArray = new char[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

    /*
   sorts the array of decimals double in descending order, returns it as an array
    */
    public static double[] sort(double[] arr) {// {2,1,3}
        Arrays.sort(arr);// {1,2,3}
        double[] reversedArray = new double[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }


}
