package Office_Hours.Practice_11_26_2020;

import java.util.Arrays;

//reverse  string array
public class ArraysPractice2 {
    public static void main(String[] args) {
// print each word staring from the last word
        String sentence = "Today is a great day to celebrate the thanks giving by doing java tasks";
        String[] words = sentence.split(" ");
        System.out.println(sentence);
        //System.out.println(Arrays.toString(words));

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            //System.out.print(words[i]+ " ");
            result += words[i] + " ";
        }

        result = result.trim();

        System.out.println("Result = " + result);

        System.out.println("===================================================================");


        int[] arr1 = new int[3];
        int[] arr2 = {1, 2, 3, 4, 5};

        arr1 = arr2;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }
}
