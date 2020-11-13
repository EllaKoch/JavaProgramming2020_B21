package day09_IfStatement;

public class ValidTriangle {
    public static void main(String[] args) {
        int angle1 = 60;
        int angle2 = 60;
        int angle3 = 90;
        boolean validTriangle = angle1 + angle2 + angle3 == 180;

        if (validTriangle){
            System.out.println("The triangle is valid");
        }

        if (!validTriangle){
            System.out.println("The triangle is not valid");
        }
        // if (!validTriangle){
        //    System.out.println("The tringle is valid: " + validTriangle);
        // }
        // if (validTriangle){
        //    System.out.println("The tringle is valid: "+ validTriangle);
        // }
    }
}
/*
Task02: ValidTriangle
         A triangle is valid if the sum of all the three angles is equal to 180
         degrees. Write a program that declares three integers as angles and
         check whether a triangle is valid or not.

 */
