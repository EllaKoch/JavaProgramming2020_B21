package day08_ShortHand_Relational;

public class TaskSwipeValueTempVar {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 10;
            a = b;//a = 15
            b = c;//b = 10

         System.out.println("a = " + a + "\nb = " + b);

        // System.out.println("a = " + (a + 5) + "\nb = " + (b - 5));

    }
}
/*
3. write a program that can swipe two variables' value by using a temporary variable
    Ex:
        a =10;
        b= 15;
    output:
        a is 15
        b is 10
 */