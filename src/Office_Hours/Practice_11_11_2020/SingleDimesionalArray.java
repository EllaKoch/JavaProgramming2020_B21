package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class SingleDimesionalArray {
    public static void main(String[] args) {

        int[] scores = new int[5];

        scores[1] = 10;
        scores[2] = 20;
        scores[0] = 50;
        scores[3] = 30;
        scores[4] = 40;

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[4]);
                    //        i < 5 ==length
        for(int i = 0; i < scores.length; i++){// i : 0 1 2 3 4
            System.out.print(scores[i]+" ");
        }
        System.out.println();
        System.out.println("==========================");

        for(int each : scores){
            System.out.print(each+" ");// each : elements
        }

    }
}
