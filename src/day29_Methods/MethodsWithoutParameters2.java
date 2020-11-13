package day29_Methods;

public class MethodsWithoutParameters2 {

    public static void main(String[] args) {
        printOddNumbers1to100();
        printEvenNumbers1to100();
    }

    public static void printOddNumbers1to100(){

        for(int i = 0; i <=100; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void printEvenNumbers1to100(){

        for(int i = 0; i <=100; i+=2){
                System.out.print(i+" ");
        }
        System.out.println();

    }






}
