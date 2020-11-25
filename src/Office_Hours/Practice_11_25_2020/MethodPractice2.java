package Office_Hours.Practice_11_25_2020;

public class MethodPractice2 {

    public static void main(String[] args) {
        // 100, 200
        max(100, 200);

        System.out.println(max(100, 200) * 2);

        System.out.println(max(100, 600, 200));

        System.out.println(max(1000, 2000, 30, 40));

        System.out.println(max(2.2, 3.3, 4.4));

        System.out.println(max(2.2, 3.3, 4.4, 5.5));

        System.out.println(max(max(1, 3, 4), 3, 60, 500));
        System.out.println(max(max(max(10, 20, 30,54), 200, 900,7), 400,65));

        System.out.println(min(3,600));
        System.out.println(min(3,5,9));
        System.out.println(min(min(0,4),5,7));
        System.out.println(min(min(min(-9,2,5),9,4),5,7));

    }


    public static int max(int a, int b) {
        int maximum = (a >= b) ? a : b;
        return maximum;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        //  int n =  max(a,b,c);
        return max(max(a, b, c), d);
    }

    public static double max(double a, double b) {
        return (a >= b) ? a : b;
    }

    public static double max(double a, double b, double c) {

        return max(max(a, b), c);
    }

    public static double max(double a, double b, double c, double d) {

        return max(max(a, b, c), d);
    }

    public static int min(int a, int b) {

        int min = (a < b) ? a : b;

        return min;
    }

    public static int min(int a, int b,int c) {

        return min(min(a,b), c);
    }

//    public static int min(int a, int b, int c) {
//
//
//
//        return min;
//    }

    /*
    create methods for min number
    make sure that max method also accepts decimals
     */


}
