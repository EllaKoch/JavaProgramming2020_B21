package library;

import java.util.Arrays;

public class ArraysUtility {
    /*
    returns the maximum number from an array of integer
     */
    public static int max(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max)
                max = each;
        }
        return max;
    }

    // finds max of decimal double array
    public static double max(double[] arr) {
        double max = arr[0];

        for (double each : arr) {
            if (each > max)
                max = each;
        }
        return max;
    }

    /*
    returns the minimum number from an array of integer
     */
    public static int min(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min)
                min = each;
        }
        return min;
    }

    // returns min number from double array
    public static double min(double[] arr) {
        double min = arr[0];

        for (double each : arr) {
            if (each < min)
                min = each;
        }
        return min;
    }


    /*
    combines two arrays of integers and returns the new array
     */
    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;// represents the index numbers of arr3
        for (int each : arr1) {
            arr3[i++] = each;
        }
        for (int each : arr2) {
            arr3[i++] = each;
        }
        return arr3;
    }

    /*
    sorts the array of  integers in descending order, returns it as an array
     */
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


    /*
    prints the array braces [] with curly braces {}
     */
    public static String printArray(int[] arr) {

        String str = Arrays.toString(arr);
        str = str.replace("[", "{").replace("]", "}");
        return str;
    }


}
