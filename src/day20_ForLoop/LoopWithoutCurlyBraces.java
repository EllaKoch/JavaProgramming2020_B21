package day20_ForLoop;

public class LoopWithoutCurlyBraces {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            System.out.println("Hello");
            System.out.println("how are you");
        }

        System.out.println("=======================================");


        for(int i = 1; i <= 5; i++)
            System.out.println("Hello");
        System.out.println("how are you?");//execute only one time out of forloop block

    }
}
