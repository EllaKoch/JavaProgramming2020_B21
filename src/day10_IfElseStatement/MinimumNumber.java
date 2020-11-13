package day10_IfElseStatement;

public class MinimumNumber {
    public static void main(String[] args) {
        int n1 = 200;
        int n2 = 10000;
        int n3 = 300;

        boolean n1Ismin = n1 < n2 && n1 < n3;
        boolean n2Ismin = !n1Ismin && n2 < n3;
        boolean n3IsMin = !n2Ismin && n3 < n1;

        String str = " is the minimum number.";

        int min = 0;

        /*
        if (n1 < n2 && n1 < n3){
            System.out.println(n1 + str);
        }
        if (n2 < n1 && n2 < n3){
            System.out.println(n2 + str);
        }
        if (n3 < n2 && n3 < n1){
            System.out.println(n3 + str);
        }


         */

        if (n1Ismin){
            //System.out.println(n1 + str);
            min = n1;
        }

        if (n2Ismin){
            //System.out.println(n2 + str);
            min = n2;
        }
        if (n3IsMin){
            //System.out.println(n3 + str);
            min = n3;
        }
        System.out.println(min + str);



    }
}
