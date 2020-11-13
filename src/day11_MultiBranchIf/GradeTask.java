package day11_MultiBranchIf;

public class GradeTask {
    public static void main(String[] args) {
        int score = 89;
        char grade = ' ';

        if (score >= 90 ){
            grade = 'A';
        }else if (score >= 80){  // && score < 90 ) it become False when score < 80
            grade = 'B';
        }else if (score >= 70){// is false when score < 70
            grade = 'C';
        }else if (score >= 60){// is false when score < 60
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
    }
}
