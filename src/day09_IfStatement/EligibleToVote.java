package day09_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "John";
        String citizenship = "USA";

        boolean eligible = citizenship == "USA";

        System.out.println(name + " is eligible to vote for Donald Trump or Joe Biden?\n\t" + eligible);


        System.out.println("=====================================");

        String name2 = "Aaron";
        boolean isUSCitizen = false;

        boolean eligibleToVote = isUSCitizen == true;
        System.out.println(name + " is eligible to vote for Donald Trump or Joe Biden?\n\t" + eligibleToVote);

    }
}
