package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

// anagram task
public class ArraysPractice3 {
    public static void main(String[] args) {

        String str1 = "abcdefg";
        String str2 = "GFEDCBA";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        boolean isAnagram = Arrays.equals(arr1,arr2);
        System.out.println(isAnagram);

    }
}
