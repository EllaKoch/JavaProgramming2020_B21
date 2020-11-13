package day20_ForLoop;

public class ForLoopDivisibleBy3And5 {
    public static void main(String[] args) {
        /*
1. write a program that can print all the ODD numbers between 0 ~ 100 that
can be divisible by 3 & 5
*/
        for(int i = 0; i<= 100; i++){
            if(i%2!=0 && i%3==0 && i%5==0){

                    System.out.print(i+ " ");
                }

            }


        /*

2. write a program that can print all the EVEN numbers between 0 ~ 100
that can be divisible by 3 & 5
Collapse
         */
        System.out.println();
        for(int i = 0; i<=100; i++){
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.print(i+" ");
            }
        }

    }

}

