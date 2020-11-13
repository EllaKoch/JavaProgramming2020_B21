package day29_Methods;

// eligibility to vote
public class VoidMethodsPractice3 {
    public static void main(String[] args) {

        eligibleToVote("Elvira","usa", 29, true);
        eligibleToVote("Bella","Russia", 35,true);
        eligibleToVote("Aaron", "usa", 135, false);

    }

    public static void eligibleToVote(String name ,String citizenship, int age, boolean isAlive) {
        if (citizenship.equalsIgnoreCase("USA")) {
            if (isAlive) {
                if (age >= 18) {
                    System.out.println(name+", you are eligible to vote!");
                } else {
                    System.err.println(name+", you must be at least 18 years old to be eligible to vote");
                }
            } else {
                System.err.println(name+", you must come back to life in order to vote");
            }


        } else {
            System.err.println(name+", you must be a citizen of USA to be eligible to vote");
        }


    }


}
