package day30_ReturnMethods;

import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {
        //Task 1
        positiveNegativeZero(777);
        positiveNegativeZero(-23);
        positiveNegativeZero(0);
        // check each element from array
        int[] numbers = {1, 2, 3, 4, -5, -6, -7, -8, 10, 11, 0};
//        for(int i = 0; i <= numbers.length-1; i++){
//            positiveNegativeZero(numbers[i]);
//        }
        for (int each : numbers) {//for each preferred
            positiveNegativeZero(each);
        }

        System.out.println("===========================================");
        //task 2

        gradeCalculator(99);
        //gradeCalculator(-120);

        //task 3
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        combineTwoArrays(a, b);

        //task 4
        removeDuplicates("aabbccc");
        removeDuplicates("oiuuiooiuuiopoop");


        // task 5
        formattedFullName("ella", "koChKarova");

    }
//1. create a function that can check if the given integer is positive, negative or zero
    public static void positiveNegativeZero(int num) {

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(num + " is: " + result);

//    if(num>0){
//        System.out.println(num+" is positive.");
//    }else if(num<0){
//        System.out.println( num+" is negative");
//    }else{
//        System.out.println(num+" is 0");
//    }


    }

    // 2. create a function that can calculate the grade of the student

    public static void gradeCalculator(int score) {
        if (score >= 0 && score <= 100) {
            System.out.println((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F");
//            if (score >= 90) {
//                System.out.println("A");
//            } else if (score >= 80) {
//                System.out.println("B");
//            } else if (score >= 70) {
//                System.out.println("C");
//            } else if (score >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }

        } else {
            System.err.println("Invalid score");
        }

    }

    //3. create a function that can print out the combination of two integer arrays
    public static void combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;// represents the index numbers of arr3
        for (int each : arr1) {
            arr3[i++] = each;
        }
        for (int each : arr2) {
            arr3[i++] = each;
        }
        //Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    //4. create a function that can print a string without the duplicated characters

    public static void removeDuplicates(String str) {// str = aabbccc
        String result = "";
        for (String each : str.split("")) {// each: [a,a,b,b,c,c,c]
            if (result.contains(each)) {
                continue;
            } else {
                result += each;
            }
        }

        System.out.println(result);
//          or:

//        for(char each : str.toCharArray()){
//            if(!result.contains(""+each)){
//                result+=each;
//            }
//        }
//          System.out.println(result);

    }

    //5.  write a method that can print out the full name of a person in regular format
    //            ex:
    //               fullName("cYbErTeK", "SCHOOL");
    //                output:
    //                    "Cybertek School"

    public static void formattedFullName(String first, String last) {
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName = first+" "+last;
        System.out.println(fullName);

    }


}
