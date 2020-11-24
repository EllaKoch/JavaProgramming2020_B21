package day32_LocalDate_WrapperClass;

public class WrapperClassIntro {
    public static void main(String[] args) {

        byte b = 100;
        Byte b2 = b;// Autoboxing happents between wrapper class and primitives only not String

       Integer b3 = (int)b;//  it  works but not good practice

        int i = 10;
      //  Byte b3 = i;// Wrapper class is only dedicated to its own primitives

        Integer I = 20;
        double d = I;// primitives take everything ==> UnBoxing
        long l = I;  // Unboxing

        Integer num = 100;
    //  Long L1 = num;// loyal to Long
        long L2 = num;//takes anything  = unboxing


        System.out.println("=========================================");

        Character ch = 'A';
        char ch2 = ch;//assigned to primitive
        int n = ch;//Unboxing = assigning to primitive

        long score = 100;
        Long d2 = score;//cannot assign to anything but long
        // long here unless you force it ex: (double) score   by casting

        Long d3 = d2; // none

        double d4 = score;// none










    }
}
