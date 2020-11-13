package day11_MultiBranchIf;

public class TernaryPractice {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        result = num%2 == 0 ? "Even" : "Odd";
        System.out.println(result);

//        if (num%2 ==0){
//            result = "Even";
//        }else{
//            result = "Odd";
//        }
//        System.out.println(result);



        System.out.println("=====================================");
            int age = 25;
            String citizenship = " ";
            String eligibleToVote = age >= 18 && citizenship == "USA" ?
                    "You are eligible to vote" : "You are NOT eligible to vote";
        System.out.println(eligibleToVote);

        System.out.println("==============================");

        int personAge = 18;

        String buyAlcohol = personAge>=21 ? "Eligible to buy alcohol" : "NOT eligible to buy alcohol";

        System.out.println(buyAlcohol);

        System.out.println("========================================");

        int number = 1000;
        String s1 = "";

        if (number>0){
            s1 = "Positive";
        }else if (number<0){
            s1 = "Negative";
        }else{
            s1 = "Zero";
        }
        System.out.println(s1);
        // ternary way :
        String s2 = (number>0) ? "Positive" :(number<0) ? "Negative" : "Zero";

        System.out.println(s2);

        System.out.println("=============================");

        int num1 = 500, num2 = 700, num3 = 1000;
        String maximum;

        maximum = num1>num2 ? "500 is maximum number" : "700 is maximum number";

        System.out.println(maximum);

        System.out.println("==============================");

        String minimum = "";

        minimum = num1<num2 ? "500 is minimum number" : " 700 is minimum number";
        System.out.println(minimum);

        System.out.println("==============================");

        String max3 = "";

        max3 = num1>num2 && num1>num3 ? num1 + " is maximum number" :
                num2>num1 && num2>num3 ? num2 + " is maximum number" :
                        num3 + " is maximum number";
        System.out.println(max3);

        System.out.println("===================================");

        String min3 = "";

        if (num1 < num2 && num1< num3){
            System.out.println(num1 + " is minimum number");
        }else if (num2 < num1 && num2 < num3){
            System.out.println(num2 + " is minimum number");
        }else{
            System.out.println( num3 + " is minimum number");
        }
        System.out.println(min3);


        String min4 = "";

        min4 = (num1 < num2 && num1 < num3) ? num1+ " is minimum number" :
                (num2 < num1 && num2 < num3) ? num2 + " is minimum number" :
                        num3 + " is minimum number";
        System.out.println(min4);





    }
}
