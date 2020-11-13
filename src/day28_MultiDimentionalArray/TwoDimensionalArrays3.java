package day28_MultiDimentionalArray;

public class TwoDimensionalArrays3 {
    public static void main(String[] args) {
        /*
         task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
         */
        int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
            //              0           1                   2

            for(int i = arr2D.length-1; i >=0; i--){// i: index of 1D arrays

                for (int each : arr2D[i]) {
                    System.out.print(each + " ");
                }
                System.out.println();
            }

        System.out.println("===================================================");

/*
task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
 */
        // int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        //                      0           1                   2

        for (int[] each1DArray : arr2D) {

            for(int i = each1DArray.length-1; i >=0; i--){
                System.out.print(each1DArray[i]+" ");

            }
            System.out.println();
        }

        System.out.println("==============================================");
        /*
        task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

         */
       // int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        //                     0           1                   2
        for(int i = arr2D.length-1; i >=0; i--){
            for(int j = arr2D[i].length-1; j >=0; j--){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

//or
        /*
        for(int i=arr2D.length-1; i>=0; i--){
            int[] each1DArray =arr2D[i];
            for(int j =each1DArray.length-1; j>=0; j--){
                System.out.print(each1DArray[j]+" ");

            }
            System.out.println();
        }

         */


    }
}
/*
int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
            task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

 */