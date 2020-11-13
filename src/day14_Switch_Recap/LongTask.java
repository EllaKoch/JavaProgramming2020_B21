package day14_Switch_Recap;

public class LongTask {
    public static void main(String[] args) {
        long num = 46567l;

        if (num >=1 && num <=100000){
            if (num <=9){
                System.out.println("1 digit");
            }else if (num <= 99){
                System.out.println("2 digits");
            }else if (num <= 999){
                System.out.println("3 digits");
            }else if(num <=9999){
                System.out.println("4 digits");
            }else if(num <= 99999){
                System.out.println("5 digits");
            }else{
                System.out.println("6 digits");
            }

        }else{
            System.out.println("Invalid");
        }
    }
}
/*
Given a number(long) determine and print how many digits it has.

    - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"
    Ex: 124 --> 3 digits
        13213 --> 5 digits
        883218 --> Invalid number
        23 --> 2 digits

 */