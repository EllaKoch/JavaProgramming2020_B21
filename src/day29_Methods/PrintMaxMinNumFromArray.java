package day29_Methods;

/*
1. create a function that can print out the maximum number from any given integer array
2. create a function that can print out the minimum number from any given integer array

 */

public class PrintMaxMinNumFromArray {
    public static void main(String[] args) {

        int[] numbers = {20,30,50,400,-30,0};
        maxNumber(numbers);
        minNumber(numbers);

    }

    public static void maxNumber(int[] arr ){
        int max = arr[0];
        for(int each : arr){
            if(each>max){
                max=each;
            }
        }
        System.out.println("Maximum number is: " + max);
    }

    public static void minNumber(int[] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number is: " + min);
    }


}
