package day12_NestedIf;

public class AgeGroup2 {
    public static void main(String[] args) {
        int age = 77;
        String group = "";

        if (age >=13 && age <= 150){
            //ternary:
            //group = (age < 21)? "Teenager" : (age < 55)? "Adult" : "Senior";

            if(age >= 55){
                group = "Senior";
            }else if (age >=21){
                group = "Adult";
            }else{
                group = "Teenager";
            }

            System.out.println(group);

        }else{
            System.out.println("You are either a child or a ghost");
        }


    }
}
/*
3. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                Hint:  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF

 */


/*

below is other version of if-else condition after pre condition is given:

if(age >= 55){
                group = "Senior";
            }else if (age >=21){
                group = "Adult";
            }else{
                group = "Teenager";
            }
 */

