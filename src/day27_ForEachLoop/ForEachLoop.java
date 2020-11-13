package day27_ForEachLoop;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        for(int i  = 0; i<=names.length-1; i++){
            System.out.println(names[i]);
        }


        System.out.println("==================================================");

        for(  String each:  names){
            System.out.println(each);
        }

        System.out.println("===================================================");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};

        int countEvens = 0;
        int countOdds = 0;

        for(int each : numbers){//each is elements of the array numbers
            if(each%2==0){
                countEvens++;
            }else{
                countOdds++;
            }
        }
        System.out.println("countOdds = " + countOdds);
        System.out.println("countEvens = " + countEvens);

        System.out.println("==================================================");

        int[] score = {10,2,3,25,5,100,-5, -2, 1000, 30, 40, 56};

        int max = score[0];
        int min = score[0];

        for (int each: score) {
            if(each>max){
                max= each;
            }
            if(each<min){
                min = each;
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);




    }
}
