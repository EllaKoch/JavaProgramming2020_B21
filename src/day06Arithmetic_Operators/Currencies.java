package day06Arithmetic_Operators;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 15000;
        int lira = (int) (dollar*7.69);
        int euro = (int) (dollar/0.86);
        int ruble = (int) (dollar*78.22);
        int JYP = (int) (dollar*105.59);
        int som = (int) (dollar*79.50);
        int AZN = (int) (dollar*1.70);
        int PLN = (int) (dollar*3.91);
        int AFG = (int) (dollar*76.90);
        int CAD = (int) (dollar*1.34);
        int PAK = (int) (dollar*165.70);

        String result = "$"+dollar+" equals to ";

        System.out.println(result+lira+" lira"+"\n"+result+euro+" euro"+"\n"+result+ruble+" rubles"+"\n"+result+JYP+" JYP");
        System.out.println(result+som+" som");
        System.out.println(result+AZN+" AZN");
        System.out.println(result+PLN+" PLN"+"\n"+result+AFG+" AFG"+"\n"+result+CAD+" CAD");
        System.out.println(result+PAK+" PAK");


        /*
        System.out.println("$"+dollar+" equal to "+lira + " lira");
        System.out.println("$" + dollar + " equal to " + euro + " euro");
        System.out.println("$" + dollar + " equal to " + ruble+ " rubles");
        System.out.println("$" + dollar+ " equal to " + JYP + " JYN" + "\n$" + dollar + " equal to " +som+ " som");
        System.out.println("$" +dollar+ " equal to "+AZN+" AZN"+"\n$"+dollar+" equal to " +PLN+" PLN");
        System.out.println("$"+dollar+" equal to "+AFG+" AFG"+"\n$"+dollar+" equal to "+CAD+" CAD"+"\n$"+dollar+" equal to "+PAK+" PAK");
        */

        /*
15000$ equal to 115384.61538461538 lira
15000$ equal to 12931.034482758621 euro
15000$ equal to 1173300.0 rubles
15000$ equal to 1666666.6666666667 JYP
15000$ equal to 1200000.0 som
15000$ equal to 25500.0 AZN
15000$ equal to 54000.0 PLN
15000$ equal to 1153500.0 AFG
15000$ equal to 20100.0 CAD
15000$ equal to 2485500.0 PAK
         */



        /*
        int dollar = 15000;

        double lira = dollar / 0.13;
        double euro = dollar / 1.16;
        double rubles = dollar * 78.22;
        double JYP = dollar/0.009;
        double som = dollar * 80;

        double AZN = dollar * 1.7;
        double PLN = dollar * 3.6;
        double AFG = dollar * 76.9;
        double CAD = dollar * 1.34;
        double PAK = dollar * 165.7;

        String result = dollar+"$ equal to ";

        System.out.println(result+lira+" lira");
        System.out.println(result+euro +" euro");
        System.out.println(result+rubles+" rubles");
        System.out.println(result+JYP+" JYP");
        System.out.println(result+som+" som");
        System.out.println(result + AZN +" AZN");
        System.out.println(result+PLN+" PLN");
        System.out.println(result + AFG+" AFG");
        System.out.println(result+CAD+" CAD");
        System.out.println(result+PAK+" PAK");
        */


    }
}
