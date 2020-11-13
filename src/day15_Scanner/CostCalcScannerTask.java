package day15_Scanner;
import java.util.Scanner;
public class CostCalcScannerTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the price of the product");
        double price = input.nextDouble();

        System.out.println("Please enter the quantity of the product");
        int quantity = input.nextInt();

        double cost = price*quantity;
        System.out.println("The cost of the products is: $" + cost);

        double discount = cost*10/100;//or cost*0.1
        double discountedCost = cost-discount;

        if(cost>=5000){
            System.out.println("Your discount is 10%: $"+discount+"\nYour new cost with the discount is: $"+ discountedCost);
        }else{
            System.out.println("Your discount is 0%\nThe new cost with discount is: $" + cost);
        }
    }
}
/*

- Cost can be calculated as the selling price of the product
times the quantity sold, i.e. Cost price × quantity.
Write a program that asks the user to enter product price
and quantity and then calculate the Cost.
If the Cost is more than 5000 a discount is 10% offered.
Program should display the discount and discounted Cost.
    Ex: 100, 3 -> 300 --> Cost: 300, Discount: 0%
    Ex: 100, 60 -> 6000 -> Cost: 5400, Discount: 10%

 */