package day10_IfElseStatement;

public class MaximimNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        int n4 = 500;

        boolean n1IsMax = n1>n2 && n2>n3 && n1 > n4;
        boolean n2IsMax = !n1IsMax && n2>n3 && n2 > n4; // ==  n2 > n1 && n2 > n3;
        boolean n3IsMax = !n2IsMax && !n1IsMax && n3 > n4; // == n3 > n2 && n3 > n1;
        boolean n4IsMax = !n3IsMax && !n1IsMax && !n2IsMax;
        String str = " is the maximum number";

        if (n1IsMax){
            System.out.println(n1 + str);
        }
        if (n2IsMax){
            System.out.println(n2 +str);
        }
        if (n3IsMax){
            System.out.println(n3 + str);
        }
        if (n4IsMax){
            System.out.println(n4 + str);
        }

    }

}
