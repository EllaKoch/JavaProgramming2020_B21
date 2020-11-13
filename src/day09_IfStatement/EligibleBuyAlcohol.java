package day09_IfStatement;

public class EligibleBuyAlcohol {
    public static void main(String[] args) {
        String name = "Aaron";
        int age = 39;

        boolean isEligible = age >= 21;

        System.out.println(name + " is eligible to buy alcohol?\n\t" + isEligible);
    }
}
