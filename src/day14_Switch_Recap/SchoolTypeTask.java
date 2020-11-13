package day14_Switch_Recap;

public class SchoolTypeTask {
    public static void main(String[] args) {
        byte grade = 0;
        String schoolType = "";
        if (grade >=1 && grade <=18){
            if(grade <= 5){
              schoolType = "Elementary School";
            }else if(grade <= 8){
                schoolType = "Middle School";
            }else if (grade <= 12){
                schoolType = "High School";
            }else if (grade <=16){
                schoolType = "College";
            }else{
                schoolType = "Grad School";
            }
        }else{
            System.out.println("Invalid grade level given");
        }

        System.out.println(schoolType);
    }
}
/*
Given a number(byte) grade level determine and print which school type someone is in.
    1-5: Elementary school
    6-8: Middle school
    9-12: High school
    13-16: College
    17-18: Grad School
    Other: Invalid grade level given
 */