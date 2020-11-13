package day08_ShortHand_Relational;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);  // 10
        a = 30;
        System.out.println(a); // 30

        String schoolName = "Cybertek";

        schoolName = "MIT";

        System.out.println(schoolName);

        int x = 100;// x = x - 62; ==> 38
            x -= 62;

        System.out.println(x);

        double salary = 100000;//0.28
               salary -= (salary * 0.28);
               //salary -= 28000;
               //salary = salary - 28000.0;
               //salary 100000 - 28000 = 72000.0;
        System.out.println(salary);


        int x2 = 999999;
            x2 -= 25;
        System.out.println(x2);


        double balance = 2000;

                balance -= 450;//balance = balance - 450

        System.out.println(balance);


                balance -= 1000;
        System.out.println(balance);

            //depositing 5000;  +=
                balance += 5000;
        System.out.println(balance);

                int y2 = 400;
                y2 +=10000 * 0.1;
                // y2 +=1000
                //y2 = 1400

        System.out.println(y2);

        String name = "Cybertek";
            name += " School";
        //name = name + school;
        System.out.println(name);

        // *=
        int a1 = 10;
            a1 *=10; //a = a *10

        System.out.println(a1);

        double totalTax = 100000;
               totalTax *= 0.28;// tatalTax = 100000 * 0.28
        System.out.println(totalTax);

        int y3 = 5000;
            y3 *= 3; // or y3 *= 2+1
        System.out.println(y3);

    //  /=
        int pizzaSlices = 10;
            pizzaSlices /= 5;//10 slices for 5 people/ each gets 2sl
        System.out.println(pizzaSlices);

        int house = 500000;
        int months = 240;//number of months to pay in 20 years

        double monthlyPayment = 500000;
            monthlyPayment /= months;
        System.out.println(monthlyPayment);


        //  %=

        int a2 = 100;
            a2 %= 3; //a2 = 100 % 3;
        System.out.println(a2);


        int m = 2000;
            m %= 2;//2000 % 2 = 0; so ==> m = 0;
        System.out.println(m);

        // ==. !=

        boolean b1 = 10 == 10;//true
        boolean b2 = 10 != 10;//false
        System.out.println(b1);
        System.out.println(b2);

        boolean b3 = "Cybertek" =="Virginia";//false
        System.out.println(b3);

        boolean b4 = "Virginia" == "virginia"; //false
        System.out.println(b4);
        boolean b5 = "Muhtar" == "Good Guy"; // false
        System.out.println(b5);
        boolean b6 = "Muhtar" != "Good Guy";// true
        System.out.println(b6);
        int k = 100;
        boolean isEven = k % 2 == 0;//100 is evenly divisible by 2
        // even number : if any number can evenly divisible by 2 with %0
        System.out.println(isEven);
        boolean isOdd = k % 2 != 0;// != means odd num => opposite of even

        System.out.println(isOdd);

    }
}
