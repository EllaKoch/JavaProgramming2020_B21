package day20_ForLoop;

public class TaskPrintStars {
    public static void main(String[] args) {
        for(int i = 7; i >=0; i--){
            System.out.println("* * * * * * ");
        }

        System.out.println();
// same task
        for(int j = 1; j <=8;j++ ){
            for(int i = 1; i <=6; i++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
