package day07_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {
        int a = 0;
        boolean isPositive = a > 0; //verify if a is a positive
        boolean isNegative = a < 0; //verify if a is a negative

        System.out.println(a+" ia positive number: " + isPositive);
        System.out.println(a+ " is a negative number: "+ isNegative);

        int b = -100 -20;// -120
        System.out.println(b);

        int c = 10 - -20;// +
                //10 + 20 = 30
        int d = -10 * 4; // -40
        int e = 10 * -4;// - 40
        int f = -10 * -4; //40

        System.out.println("======================");
        int x = 100;
        ++x;// 101 = increase the value by 1

        System.out.println(x);

        int y = 100;
        --y; //99 = decrease by 1
        System.out.println(y);

        int z = 100;
        System.out.println(--z);//99

        int x2 = 100;
        System.out.println(++x2);// = 101

        System.out.println("==================================");
        //POST:

        int a2 = 100;
        System.out.println(a2++);//will NOT increse immidiatly
        //first it will pass the current value which is 100

        int b2 = 100;
        System.out.println(b2--);//100 pass the current value
        System.out.println(b2);//99


            int score = 50;
            if(score == 0){
                score+=50;
            }

            if(score!=0){
                score+=50;
            }
        System.out.println(score);

            boolean X = true;
            boolean Y = !X == false;
            boolean Z = Y;

            if(X){
                System.out.println(X);
            }
            if(Y){
                System.out.println(Y);
            }
            if(Z){
                System.out.println(Z);
            }

            String weather = "";
            int degree;
            weather = "Shiny";
            degree = 70;
            boolean comp = (!(weather=="Rainy"||degree==70));
        System.out.println("comp = " + comp);

        int abc = 2;
        boolean cbd = ++abc==2||--abc == 2 && --abc ==2;
        System.out.println(cbd + " cbd");

    }
}

