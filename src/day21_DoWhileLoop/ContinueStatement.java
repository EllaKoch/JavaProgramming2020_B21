package day21_DoWhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i =1; i <= 5; i++){

            if(i==3){
                continue;
            }

            System.out.print(i+" "); // 1 2 4 5
        }

        System.out.println();

        System.out.println("============================================");

        // print odd numbers 1 to 50
        for (int i  = 1; i <=50; i++){
            if(i%2==0){
                continue;
            }

            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("============================================");

        //print even numbers 1 to 50

        for(int i = 1; i <=50; i++){

            if(i%2!=0){
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("============================================");
        //print numbers between 1 to 50 that are evenly divisible by 3(continue statement)

        for(int i = 1; i <=50; i++){
            if(i%3!=0){
                continue;
            }
            System.out.print(i + " ");
        }


    }
}
