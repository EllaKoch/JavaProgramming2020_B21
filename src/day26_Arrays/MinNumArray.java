package day26_Arrays;
/*
 3. write a program that can return the minimum number from an array of integers

 */
public class MinNumArray {
    public static void main(String[] args) {
        int[] numbers = {-40, 43, 799, 1, 0, -354};

        int min = numbers[0];

        for(int i = 1; i<= numbers.length-1; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);




    }
}
