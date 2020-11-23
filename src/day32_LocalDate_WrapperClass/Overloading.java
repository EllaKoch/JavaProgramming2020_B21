package day32_LocalDate_WrapperClass;

public class Overloading {
    public static void main(String[] args) {
        System.out.println("String");

        int[] arr1 = {1,2,3};
        main(arr1);//  "Int"

    }

    public static void main(int... args){// you can use ... for [] ONLY in parameter
                                                        // and it has to be the first or the last one
        System.out.println("Int");
    }

    public static void main(double[] args){
        System.out.println("Double");
    }

    public static void main(char[] args){
        System.out.println("char");
    }


}
