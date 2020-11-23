package day32_LocalDate_WrapperClass;

public class ValueOfMethod {
    public static void main(String[] args) {


        String s1 = "123";
        int num1 = Integer.valueOf(s1);// unboxing
      // primitive <==== wrapper class
        Integer num2 = Integer.valueOf(s1);// none autoboxing or unboxing

        System.out.println(num1+1);

        String s2 = "2.5";

        double num3 = Double.valueOf(s2);
        System.out.println(num3+1);// + 1 is just to check if it is a number not a string

        String s3 = "true";// not case sensitive
        boolean r1 = Boolean.valueOf(s3);// unboxing
        System.out.println(r1);


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

    }
}
