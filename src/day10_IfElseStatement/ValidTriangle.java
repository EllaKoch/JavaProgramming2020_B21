package day10_IfElseStatement;

public class ValidTriangle {
    public static void main(String[] args) {
        int angle1 = 60 ;
        int angle2 = 30 ;
        int angle3 = 90 ;

        boolean isValid = (angle1 + angle2 + angle3) == 180;

        if((angle1 + angle2 + angle3) == 180){
            System.out.println("The triangle is valid");
        }
        if (!isValid){
            System.out.println("The triangle is not valid");
        }
    }
}
