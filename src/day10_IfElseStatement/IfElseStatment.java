package day10_IfElseStatement;

public class IfElseStatment {
    public static void main(String[] args) {
        int number = 101;
        boolean isEven = number%2 ==0;

        if(isEven){
            System.out.println(number +" is even");
        }else{
            System.out.println(number + " is odd");
        }

        System.out.println("==================================");

        int score = 85;

        if (score >= 60){
            System.out.println("You passed!");
        }else{
            System.out.println("You failed :(");
        }








    }

}
