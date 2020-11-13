package day15_Scanner;
import java.util.Scanner;
public class AverageGradeScanner {
    public static void main(String[] args) {
        Scanner gradeAverage = new Scanner(System.in);

        System.out.println("Enter you first subject grade (0 to 100)");
        int grade1 = gradeAverage.nextByte();

        System.out.println("Enter your second subject grade(0 to 100)");
        int grade2 = gradeAverage.nextByte();

        System.out.println("Enter your third subject grade(0 to 100)");
        int grade3 = gradeAverage.nextByte();

        char grade = ' ';

        int gradeAvr = ((grade1 + grade2 + grade3) / 3);

        if(grade1>=0 && grade1 <= 100 && grade2>=0 && grade2 <=100 && grade3 >=0 && grade3 <=100){
            System.out.println("Your average grade score is: " + gradeAvr);
            if (gradeAvr >= 90) {
                grade = 'A';
            } else if (gradeAvr >= 80) {
                grade = 'B';
            } else if (gradeAvr >= 70) {
                grade = 'C';
            } else if (gradeAvr >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Your grade is: " + grade);
        }else{
            System.out.println("Please enter valid subject grades numbers from 0 - 100");
        }
    }
}
/*
The marks obtained by a student in 3 different subjects are
input by the user. Your program should calculate the average of subjects.
 The student gets a grade as per the following rules:
    90-100  A
    80-89   B
    70-79   C
    60-69   D
    0-59    F
    Ex: 86, 74, 90 -> B
 */