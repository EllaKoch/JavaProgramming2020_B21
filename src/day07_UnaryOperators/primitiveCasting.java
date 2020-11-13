package day07_UnaryOperators;

public class primitiveCasting {
    public static void main(String[] args) {
        short a = 3000;
        long b = a; // = implicit casting, auto done
        // = 3000L

        int c = (int) b;// MUST BE DONE MANUALLY = EXPLICIT

        int d = a; //again casted implicitly

        double d1 = 200.5;
        int d2 = (int)d1; // = 200; it lost the decimal portion

        System.out.println("=========================");

        long l1 = 100;
        short s2 = (short) l1;// explicit casting

        double d4 = 300;
        float f1 = (float) d4;
        // for mac : holding option + hit ENTER

        long l2 = 300; //implicit casting
                        // 300L
        int i2 = (int) l2;
                //300

        System.out.println("===========================");
        short s3 = 400;
        byte b1 = (byte) s3;// 400 IS OUT OF BYTES RANGE
        // SHOULD NEVER CAST TO A TYPE THAT IS IN SMALLER RANGE.
        //IT DOES NOT EFFECT ON THE LIMIT of the data type








    }
}
