package Office_Hours.Practice_11_11_2020;
/*

			arr1: {1,2,3,4,5}
			arr2: {4,5,6,7,8}
			output:
				4 5    print common elements of both arrays
 */
public class ArrayPractice1 {
    public static void main(String[] args) {
       int[] arr1 = {1,2,3,4,5,6,7,8,9};
       int[] arr2 = {10,3,12,13,14,1};

       for(int j = 0; j<arr1.length; j++) {//iterates the arr1' indexes
           int element = arr1[j];// 1
           for (int i = 0; i <= arr2.length - 1; i++) {//iterates the arr2' indexes
               if (element == arr2[i]) {
                   System.out.print(element +" ");
                   break;//exits only inner loop
               }
           }
       }
        System.out.println();
        System.out.println("====================================================");

       for(int each : arr1){// elements of arr1
           for(int each2 : arr2){//elements  of arr2
               if(each==each2){
                   System.out.print(each);//prints common elements
                   break;//if its already contains it will break the loop
               }
           }
       }



    }
}
