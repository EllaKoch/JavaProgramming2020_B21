package day17_Strings;
/*
 Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their first name (String, single word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
 */

import java.util.*;
public class Scanner_Recap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a product name:");
        String product = input.nextLine();

        System.out.println("Enter the price:");
        double price = input.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();//we have to hit enter to submit the info
        // and that enter will be absorbed by nextLine below.
        // that's why we need an extra nexline method call

        input.nextLine();//this one absorbs the enter above

        System.out.println("Enter your full name");//this one would absorb
        // if we didnt put the extra nextLine
        String fullName = input.nextLine();

        System.out.println(fullName + " your order for "+ quantity + " " + product+ " has been placed. Your total is "+ (price*quantity));


    }
}
