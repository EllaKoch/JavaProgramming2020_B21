package Office_Hours.Practice_11_27_2020;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int wd = 0;
        String[] days = {"sun", "mon", "wed", "sat"};
        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd += 2;
            }
        }
        System.out.println(wd);
//

        int[] array = {71,70,5,5,1, 15};

       for(int i = 0; i < array.length; i++){
            for(int j = i+1; j< array.length; j++){
                if(array[i] > array[j]){

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

       int[] arr = {4,2,7,2,2,-1};
       for(int i  = 1; i <= arr.length-1; i++){

           int temp = arr[i];
           int j = i-1;
           while( j >= 0 && temp < arr[j]){
               arr[j+1] = arr[j];
               j--;
           }
                arr[j+1] = temp;


           System.out.println(Arrays.toString(arr));
       }

    }
}
