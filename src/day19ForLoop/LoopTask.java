package day19ForLoop;

public class LoopTask {
    public static void main(String[] args) {

        for(int i = 0; i <= 100; i++){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("==============================");

        for(int i = 100; i <= 200; i++){
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.println("==============================");

        //

        for(int i = 1; i<=100; i+=2 ){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=================================");

        for(int i = 0; i <= 100; i++){
            if(i%2!=0){
                System.out.print(i+ " ");
            }
        }

        System.out.println();
        System.out.println("=================================");

        for(int i = 0; i <= 100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=================================");

        for(int i = 0; i<= 100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("=================================");

        for(int i = 1; i <=5; i++){
            System.out.println("Push Up "+ i);
        }

        System.out.println();







    }
}
