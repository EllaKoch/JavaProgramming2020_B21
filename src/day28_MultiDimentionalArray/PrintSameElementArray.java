package day28_MultiDimentionalArray;

import java.util.Arrays;

/*
Ex:
			arr1: {1,2,3,4,5}
			arr2: {4,5,6,7,8}
			output:
				4 5
 */
public class PrintSameElementArray {
    public static void main(String[] args) {
        int[] arr1 =  {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};




        for(int i = 0; i<arr1.length; i++){
            int eachNumber = arr1[i];
            for(int j = 0; j <arr1.length; j++){
                if(eachNumber==arr2[j]){
                    System.out.print(eachNumber+ " ");
                }

            }
        }

        System.out.println();

        for(int each : arr1){
            for(int each2 : arr2){
                if(each==each2){
                    System.out.print(each+" ");
                }
            }
        }

    }

}
