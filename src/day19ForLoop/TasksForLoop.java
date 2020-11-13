package day19ForLoop;

public class TasksForLoop {
    public static void main(String[] args) {
        // Task 6:  write a program that can print a ~ z in same line sperated by space
        for(char a = 97; a <= 122; a++){
            System.out.print(a+" ");
        }
        System.out.println();

        //Task 7: write a program that can print A ~ Z in same line sperated by space

        for( char a = 65; a <=90; a++){
            System.out.print(a+" ");
        }
        System.out.println();
        //task 8: 8. print out the first 30000 characters in same line seperated by space

        for(char a = 0; a <=3000; a++ ){
            System.out.print(a+ " ");
        }
        System.out.println();
        for(int i = 1; i <=50; i++){
            System.out.println("Push Up " + i);
        }



    }
}
