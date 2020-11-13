package day14_Switch_Recap;

public class If_Practice {
    public static void main(String[] args) {
        int n = 10097;
        if (n%2 != 0){
            System.out.println(n + " is odd");
        }else{
            System.out.println(n + " is even");
        }

        int age = 14;

        if (age>=18){
            System.out.println(" You are eligible to get a driver's licence");
        }else{
            System.out.println("You must be 18 or older to be eligible");

        }

        int grade = 'A';
         if (grade=='A' || grade == 'B'|| grade == 'C' ){
             System.out.println("Passed");
         }else{
             System.out.println("Failed");
         }

         int n1 = 100;
         int n2 = 200;

         if (n1>n2){
             System.out.println(n1 + " is greater than " + n2);
         }else if(n2>n1){
             System.out.println(n2 + " is greater than " + n1);
         }else{
             System.out.println(n1 + " is equal to " + n2);
         }

        System.out.println("=================================");

         int num = 4;// 1~7

        if (num == 1) System.out.println("Today is Monday");
        else if(num == 2) System.out.println("Today is Tuesday");
        else if(num == 3) System.out.println("Today is Wednesday");
        else if(num == 4) System.out.println("Today is Thursday");
        else if(num == 5) System.out.println("Today is Friday");
        else if(num == 6) System.out.println("Today is Saturday");
        else System.out.println("Today is Sunday");
        // without curly braces the block can contain ONLY one Print statement

        int Age = 21;

        if(Age <21){
            System.out.println("Teenager");
        }else if(Age>=21 && Age <=55){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
        //nested if

        int AGE = 2;

        if(AGE >=1 && AGE <= 150){
            if(AGE<21){
                System.out.println("Teenager");
            }else if (AGE >=21 && AGE <=55){
                System.out.println("Adult");
            }else{
                System.out.println("Senior");
            }




        }else{
            System.out.println("Invalid age");
        }



    }
}
