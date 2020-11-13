package day12_NestedIf;

public class ageTask {
    public static void main(String[] args) {
        int age = 86;
        String ageGroup = "";

        if(age <= 2){
            ageGroup = "Infant";
        }else if(age >=3 && age <= 5){// don't have to specify (age >= 3) since if line 8 is false then line 10 is true
            ageGroup = "Toddler";
        }else if(age <=9){
            ageGroup = "Kid";
        }else if(age <= 12){
            ageGroup = "Pre-Teen";
        }else if(age <= 17){
            ageGroup = "Teenager";
        }else if(age <= 20){
            ageGroup = "Young Adult";
        }else if(age <= 39){
            ageGroup = "Adult";
        }else if(age <= 49){
            ageGroup = "Young Middle-Aged Adult";
        }else if(age<= 54){
            ageGroup = "Middle Aged";
        }else if(age <= 64){
            ageGroup = "Very Young Senior Citizen";
        }else if (age <= 74){
            ageGroup = "Young Senior Citizen";
        }else if (age <= 84){
            ageGroup = "Senior Citizen";
        }else{
            ageGroup = "Old Senior Citizen";
        }

        System.out.println(ageGroup);

    }
}
/*
2. write a program that can define the age groups of a person
                 age groups are:
                        infant (< 1 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
 */