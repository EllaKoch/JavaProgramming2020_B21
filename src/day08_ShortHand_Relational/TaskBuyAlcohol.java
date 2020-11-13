package day08_ShortHand_Relational;

public class TaskBuyAlcohol {
    public static void main(String[] args) {
        String name = "James";
        String name2 = "Aaron";
        int age = 19;
        int age2 = 39;
        boolean isEligible = age >= 21;
        boolean isEligible2 = age2 >= 21;
        System.out.println(name + " is eligible to buy alcohol: " + isEligible);
        System.out.println(name2 + " is eligible to buy alcohol: " + isEligible2);


    }
}
/*
1. write a program that can check if the person is eligible to buy alcohol
        Ex:
            name = "James"
            age = 19
            output:
                James is eligible to buy alcohol?
                    false
            name = "Aaron"
            age = 39
            output:
                Aaron is eligible to buy alcohol?
                    true
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
3. write a program that can swipe two variables' value by using a temporary variable
    Ex:
        a =10;
        b= 15;
    output:
        a is 15
        b is 10
4. write a program that can swipe two variables' value without using a temporary variable
    Ex:
        a =10;
        b= 15;
    output:
        a is 15
        b is 10
        Hint: you will need to use some Arithmetical Operators

 */