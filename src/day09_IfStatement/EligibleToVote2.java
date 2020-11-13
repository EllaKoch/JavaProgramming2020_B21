package day09_IfStatement;

public class EligibleToVote2 {
    public static void main(String[] args) {
        String name = "Jimmy";
        boolean isUSACitizen = false;
        int age = 25;
        boolean hasCriminalBGround = false;

        boolean isEligible = isUSACitizen == true && age >= 18 && hasCriminalBGround ==false;
            //              false = true     && 25 >= 18 && false = true
            //                  false        && true     && false
            //                      false
        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("===================================================");

            String name2 = "John";
            String C1 = "Canada";
            String C2 = "USA";

            boolean eligible = C1 == "USA" || C2 == "USA";
            //                  false         true
            //                         ^= true

        System.out.println(name2 + " is eligible to vote: " + eligible);




    }
}
