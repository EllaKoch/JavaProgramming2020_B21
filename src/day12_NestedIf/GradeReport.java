package day12_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 98;
        String grade = "";

        if (score >=0 && score <= 100){// pre conditon

            grade = (score >= 90)? "A" : (score >= 80)? "B"
                    :(score >= 70)? "C" :(score >= 60)? "D"
                    : "F";

        }else{//else if precondition is false
            grade = "Invalid";
        }

        System.out.println(grade);


    }
}
