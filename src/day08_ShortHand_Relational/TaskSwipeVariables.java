package day08_ShortHand_Relational;

class TaskSwapVariables {
    public static void main(String[] args) {
        int a = 10;
            a += 5;//a = a + 5
        int b = 15;
            b -= 5;//b = b - 5
        System.out.println("a = " +a + "\nb = " + b);

    }
}
/*
4. write a program that can swipe two variables' value without using a temporary variable
    Ex:
        a =10;
        b= 15;
    output:
        a is 15
        b is 10
        Hint: you will need to use some Arithmetical Operators

 */