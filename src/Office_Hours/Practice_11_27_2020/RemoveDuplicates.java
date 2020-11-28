package Office_Hours.Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4};//  1,2,3,4

        ArrayList<Integer> list = new ArrayList<>();
     /*
        for(int i = 0; i<arr.length; i++){
            if(list.contains(arr[i])){
                continue;
            }
            list.add(arr[i]);
        }
        System.out.println(list);
*/

        for (int each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }


        int[] nonDup = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            nonDup[i] += list.get(i);
        }

        System.out.println(Arrays.toString(nonDup));


    }

    public static int[] removeDuplicates(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
     /*
        for(int i = 0; i<arr.length; i++){
            if(list.contains(arr[i])){
                continue;
            }
            list.add(arr[i]);
        }
        System.out.println(list);
*/

        for (int each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        int[] nonDup = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            nonDup[i] += list.get(i);
        }

        return nonDup;
    }

    public static double[] removeDuplicates(double[] arr) {

        ArrayList<Double> list = new ArrayList<>();

        for (double each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        double[] nonDup = new double[list.size()];

        for (int i = 0; i < list.size(); i++) {
            nonDup[i] += list.get(i);
        }

        return nonDup;
    }

    public static char[] removeDuplicates(char[] arr) {

        ArrayList<Character> list = new ArrayList<>();

        for (char each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        char[] nonDup = new char[list.size()];

        for (int i = 0; i < list.size(); i++) {
            nonDup[i] += list.get(i);
        }

        return nonDup;
    }

    public static String[] removeDuplicates(String[] arr) {

        ArrayList<String> list = new ArrayList<>();

        for (String each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        String[] nonDup = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            nonDup[i] += list.get(i);
        }

        return nonDup;
    }







}
