package day10_IfElseStatement;

public class Shorthand {
    public static void main(String[] args) {
        int a = 100;

        System.out.println(a);// 100

        System.out.println(++a);//101

        a = 200;

        System.out.println(a);//200
        System.out.println(++a);// 201
        System.out.println(a);// 201

        a = 300;
        System.out.println(a);

        String name = "Daniel";
        System.out.println(name);// Daniel

        name = "John";
        System.out.println(name);//John

    // +=

        int A = 200;
        System.out.println(A);//200

            A += 100;
        System.out.println(A);//300

        String school = "Cybertek";
        // school = school = " School"
                school += " School";//concatination assignment
        System.out.println(school);

        int savingAccount = 1000;
            savingAccount += 2000; //october

        System.out.println(savingAccount);//3000;

             savingAccount += 500;//november
        System.out.println(savingAccount);//3500

    // -=:

            savingAccount -= 1000;// spent for X-mas
        System.out.println(savingAccount);// 2500

            savingAccount -= 500;
        System.out.println(savingAccount);//2000;


    // *=:

            double salary = 100000.50;
                   salary *= 1.2;// salary increase 20 %

        System.out.println(salary);

            int Y = 10;
                Y *= 10;
        System.out.println(Y);

    // /=:

        double tax = 10000;
                tax /= 2;// tax cut by half
        System.out.println(tax);

        int B = 3000;
         //    B /= 0; cannot deide by 0 in Java

        System.out.println(B);

    // %= :

        // remainder: if the numerator cannot be evenly divisible by denominator

        // in math : 10/4 = 2.5
        // remainder: 10 - (4 *2) = 2;
        // in Java : 10 % 4 ==> 2

        int T = 100;
            T%=10;
        System.out.println(T);// 0

        int U = 35;
            U %= 9;
            // 35/9 = 3.88..
            // remainder: 35 -(9*3) = 8
        System.out.println(U);//8





    }
}
