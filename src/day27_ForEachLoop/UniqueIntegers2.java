package day27_ForEachLoop;

public class UniqueIntegers2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 1};

        // how many times 1 occurred in the array

        for(int each2 :arr) {

            int frequency = 0;//frequency of each2
            for (int each : arr) {
                if (each == each2) {
                    frequency++;
                }
            }
           if(frequency==1){
               System.out.print(each2+" ");
           }

        }
    }
}
