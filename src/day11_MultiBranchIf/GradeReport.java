package day11_MultiBranchIf;

public class GradeReport {
    public static void main(String[] args) {
        int mark = 99;// 0 ~ 100
        String result = "";

        if (mark < 60){
            result = "Failed";
            //System.out.println("Failed"); if there is no string result
        }else if (mark >= 60 && mark < 90){
            result = "Passed";
            //System.out.println("Passed");
        }else{
            result = "Passed with distinction";
            //System.out.println("Passed with distinction");
        }

        System.out.println(result);

    }
}
/*

1. Program :
• Declare 3 numbers
• Program should display which one is largest
2. Write a Java Program for the following logic:
§ If marks < 60, then print “Fail”
§ If marks >= 60, but less than 90, then print “Pass”
§ If marks >= 90, then print “Passed with Distinction”
 */