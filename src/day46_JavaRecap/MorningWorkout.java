package day46_JavaRecap;

public class MorningWorkout {

    public static void main(String[] args) {
/*
MorningWorkOut:
        1. Do 30 push ups
                try pausing 1.5 seconds in each
        2. Do 20 Pull up
                try pausing 2.5 seconds in each

 */


        for(int i = 1; i<=30; i++ ){
            System.out.println("Push up "+i);
            sleep(1.5);
        }

        for(int i = 1; i <= 20; i++){
            System.out.println("Pull Up " + i);
            sleep(2.5);
        }


    }


    public static void sleep(double seconds) {// 2.5
        //               2          * 1000  logical error when casting that's why grouping helps

        try{
            Thread.sleep((long) (seconds * 1000));

        }catch (InterruptedException e){

        }
    }


}
