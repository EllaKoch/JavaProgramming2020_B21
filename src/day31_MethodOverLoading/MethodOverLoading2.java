package day31_MethodOverLoading;

public class MethodOverLoading2 {
    public static void main(String[] args) {

        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(30, 40, 50, 60));

        System.out.println(sum(10.5, 20.5));
        System.out.println(sum(10.5, 30.4, 20.4));
        System.out.println(sum(10.5, 30.4, 20.4, 40.3));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + sum(b, c);
    }

    public static int sum(int a, int b, int c, int d) {
        return sum(a, b, c) + d;
    }

    public static double sum(double a, double b) {

        return a + b;
    }

    public static double sum(double a, double b, double c) {

        return sum(a, c) + b;
    }

    public static double sum(double a, double b, double c, double d) {

        return sum(a, b, c) + d;
    }

    public static void sum(int a, int b, double c){

    }
}
