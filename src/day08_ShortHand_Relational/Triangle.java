package day08_ShortHand_Relational;

public class Triangle {
    public static void main(String[] args) {

        int angle1 = 30, angle2 = 30, angle3 = 90;
        int sum = angle1 + angle2 + angle3;

        boolean isValid = sum == 180;

        System.out.println("The triangle is valid: " + isValid);
    }
}
