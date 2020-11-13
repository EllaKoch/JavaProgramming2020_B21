package day26_Arrays;
/*
7. write a program that can find the unique numbers from an integer array
            int[] arr ={1,2,3,1,2,4}
            output:
                3 4

 */
public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,4};
        String result = "";//or use int result here

        for(int j = 0; j<= arr.length-1; j++){
            int numbers = arr[j];
            int count = 0;
            for(int i = 0; i<arr.length; i++){
                int eachNum = arr[i];
                if(eachNum==numbers){
                    count++;
                }
            }
            if(count==1){
                result+=numbers +" ";//if result is int should be = numbers + "", NOT += numbers +"" as its with String
            }
        }

        System.out.println("Unique numbers are: " + result);







    }
}
