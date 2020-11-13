package day14_Switch_Recap;

public class ArmyTask {
    public static void main(String[] args) {
        String citizenship = "Korea";
        boolean isAlien = true;
        boolean isResident = false;
        boolean hasHighSchoolDiploma = false; //high school diploma

        int age = 24; //17 ~34
        int dependents = 2; // 1~2

        if (citizenship == "USA" || isResident || isAlien
                && age >= 17 && age <= 34
                && hasHighSchoolDiploma == true && dependents <= 2) {
            System.out.println("You are qualified for the US Army");
        } else {
            System.out.println("You are not qualified:\nEither You must have not more than two dependents \n" +
                    "OR You must have a high school diploma \n" +
                    "OR You must be between 17 or 34 years old.");
        }
    }
}
/*
        if (citizenship == "USA" || isResident || isAlien){

            if (age >=17 && age <=34){

              if (hasHighSchoolDiploma == true){

               if (dependents <= 2){

                   System.out.println("You are qualified for the US army");

               }else{
                   System.err.println("You must have not more than two dependents");
               }
              }else{
                  System.err.println("You must have a high school diploma");
              }

            }else{
                System.err.println("You must be between 17 or 34 years old");

            }

        }else{
            System.err.println("Must be a U.S. citizen or a U.S Resident or an Alien");

        }

    }
}

 */

/*

	2. What are the qualifications to join the Army?
			You must be a U.S. citizen or a resident alien.
			Be between the ages of 17-34. ...
			Have a high school diploma.
			Have no more than two dependents.





 */