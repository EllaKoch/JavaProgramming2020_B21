package day20_ForLoop;
/*

3. print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
    Hint: in the loop body , only place the statements that you need to repeat

 */
public class TaskStar2 {
    public static void main(String[] args) {
        System.out.println("* * * * * *");
        for(int i = 7; i >=0; i--){
            System.out.println("*         *");
        }
        System.out.println("* * * * * *");


        for(int i = 1; i <= 5; i++){
            if(i==1||i==5){
                System.out.println("*****");
            }else{
                System.out.println("*   *");
            }
        }



    }
}
