package day15_Scanner;

import java.util.Scanner;

public class CurveGradeTaskScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the curve  for the class");
        double curve = scan.nextDouble();
        System.out.println("Enter your grade points");
        double score = scan.nextDouble();

        double curvePercentValue = curve / 100;
        double afterCurve = score * curvePercentValue + score;


        if (curve > 0 && curve < 100 && score > 0 && score < 100) {
            System.out.println(afterCurve + " after curve");

            boolean extraCredit = false;
            if (afterCurve < 90) {
                System.out.println("Did you do the extra credit? True/False?");
                extraCredit = scan.nextBoolean();
            }
            if (extraCredit == true) {
                System.out.println("Your grade with extra credit is: " + (afterCurve * 0.02 + afterCurve));
            } else {
                System.out.println("Final grade is: " + afterCurve);
            }

        } else {
            System.out.println("Invalid curve");
        }
    }
}
/*
Ask the user to enter the curve percentage for the class
and to enter their grade to determine
if the curve will allow them to get an A (>= 90). [Use double datatype]
-In the case the given curve is more than
 100 or less than 0, print Invalid curve
-In the case the given grade is less than 0, print invalid grade
- In the case the student was not able to get an A after the curves (grade was less than 90).
 Ask them if they did the extra credit assignments(boolean)
 If the student did the extra credit add 2 whole percentage to their grade
 Ex: 15, 80 --> 92.0 after curve. Final Grade:  92.0
 Ex: 25, 55 --> 68.75 after curve, Did you do extra credit -> false -> Final grade: 68.75
 Ex: 20, 60 --> 72.0 after curve, Did you do extra credit -> true -> Final grade: 74.0
 Hint: (curve value / 100) --> Percentage value of the curve

 */