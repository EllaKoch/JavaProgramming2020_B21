package day08_ShortHand_Relational;

public class TaskVote {
    public static void main(String[] args) {

        String name1 = "John";
        String citizenship1 = "USA";
        String name2 = "Jimmy";
        String citizenship2 = "Korea";
        boolean isEligibleToVote1 = citizenship1 == "USA";
        boolean isEligibleToVote2 = citizenship2 != "Korea";// or citizenship2 == "USA"
        System.out.println(name1 + " is eligible to vote for Donald Trump or Joe Biden: " + isEligibleToVote1);
        System.out.println(name2 + " is eligible to vote for Donald Trump or Joe Biden: " + isEligibleToVote2);







    }
}
/*
2. write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true
            name = "Jimmy"
            citizenShip = "Korea"
            output:
                Jimmy is eligible to vote for Donald Trump or Joe Biden?
                    false
 */