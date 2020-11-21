package day30_ReturnMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        //int multiplication = addition(10,20)*3; can not assign in void method

        System.out.println(addition2(10, 20));
        int sum = addition2(10, 20);
        int multiplication = sum * 3;
        System.out.println(multiplication);


    }

    public static void addition(int n1, int n2) {//void method
        int n3 = n1 + n2;
        System.out.println(n3);
    }

    public static int addition2(int n1, int n2) {// return type method
        int n3 = n1 + n2;
        return n3;
    }


}
