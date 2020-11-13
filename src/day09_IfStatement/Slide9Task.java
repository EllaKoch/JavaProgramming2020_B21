package day09_IfStatement;

public class Slide9Task {
    public static void main(String[] args) {
        int b = 2;//1
        boolean res = ++b == 2 || --b == 2 && --b == 2;
//                     3  == 2 || 2   == 2 &&   1 ==  2


        System.out.println(res);
        System.out.println(b);

        System.out.println("=============================");
        int y = 20;
        boolean x = true, z = true;
        x = (y!=10) || (z=false);
        System.out.println(x);

        System.out.println("=============================");

        double A = 20;
        double B = 80;
        double result = (A + B) * 25 % 40;
        boolean total = result<= 20;
        System.out.println(result+ " is equal to 20 or less: " + total);




    }
}
