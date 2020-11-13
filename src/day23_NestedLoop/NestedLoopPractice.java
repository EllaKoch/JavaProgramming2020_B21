package day23_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

        for(int j = 1; j <=10; j++){// 1, 2 , 3, 4, 5, 6, 7, 8
            System.out.print("\t\t\t\t\t");
            for (int i = 1; i<=j; i++){// 1, 2 , 3, 4, 5, 6, 7, 8  that's y i<=j
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("===================================");

        //reverse

        for(int j = 10; j>=1; j--){
            System.out.print("\t\t\t\t\t");
            for(int i = 1; i<=j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }










    }
}
