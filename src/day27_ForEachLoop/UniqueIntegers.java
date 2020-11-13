package day27_ForEachLoop;

/*
Task:
    1. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}
            output:
                2 4

 */
public class UniqueIntegers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 1};


        for (int j = 0; j < arr.length; j++) {
            int element = arr[j];
            int frequency = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    frequency++;
                } //System.out.println("frequency = " + frequency);

            }
            if (frequency == 1) {
                System.out.println(element + " ");
            }

        }


    }
}
