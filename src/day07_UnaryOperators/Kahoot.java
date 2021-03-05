package day07_UnaryOperators;

public class Kahoot {
    public static void main(String[] args) {
        System.out.print("Result A" + 0 + 1);
        System.out.print("; Result B" +(1)+(2) +"\n");

        System.out.println("=============");

        double a1 = 10/3;
        System.out.println(a1);


        int gallons = 100;
        int liters = (int)(gallons*3.785);
        System.out.println( gallons + " gallons equal to " + liters +" liters");

        System.out.println("=========================");
        int kg = 100;
        int pounds = (int) (kg*2.20462);
        System.out.println(kg+" kg equals to "+ pounds+ " pounds");

        System.out.println("==========================");
        int a = 100;// 100
        int b = -a++ + ++a - a-- * a-- % 2;
        // b = -100 + 102 - 102 * 101 % 2
        // b = -100 + 102 - 10302 % 2
        // b = -100 + 102 - 0
        // b = 2 - 0 = 2
        System.out.println("a = " + a+", b = " + b);



    }
}
/*
1. write a program that converts the given number of gallons to liters.
                Note: MUST return integer result
                Ex:
                    gallons: 100
                    output:
                        100 gallons equal to 378 liters
                Hint: 1 gallon = 3.785 liters
    2. write a program that can convert the given number of kg to pounds
            Note: MUST return integer result
            Ex:
                kg = 100;
                output:
                    10 kg equal to 220 pounds
            Hint: 1kg = 2.20462 pounds

    3. manually calculate the following code fragements:
                1. int a = 100;
                   int b = -a++ + ++a - a-- * a-- % 2
Collapse




 */