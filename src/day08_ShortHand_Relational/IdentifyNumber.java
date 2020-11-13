package day08_ShortHand_Relational;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = -100;
        boolean isPositive = number > 0;
        boolean isNegative = number <0;
        boolean isZero = number == 0;

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is equal to zero: " + isZero);

        int angle1 = 30, angle2 = 30, angle3 = 90;
        int sum = angle1 + angle2 + angle3;

        boolean isValid = sum == 180;

        System.out.println("The triangle is valid: " + isValid);




    }
}
