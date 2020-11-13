package day17_Strings;
/*
- Stock market
    - Ask the user how many total shares they have already? (int)
        -> If the user gives 0 or give a negative number none of the
        rest condition should be executed
    - Ask the user how much their total value in the stock market is (double)
    - Ask the user to enter the name of the company they have the
     most shares in (String, multiple words)
    - Ask the user the value of those shares (double)
    - Calculate and print the difference of the user's total stock
    market valued with the biggest share value
    - Print in the following format:
        "Your total stock market holding is $totalValue which
        is made up of $totalShareNumber. $companyName is the largest
        company holdings you have of $companyValue between $companyShares."

 */
import java.util.Scanner;
public class StringStockShares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of total shares you have:");
        int totalShares = scan.nextInt();

        if(totalShares > 0){
            System.out.println("Enter the total value of shares in stock market:");
            double totalValue = scan.nextDouble();

            scan.nextLine();

            System.out.println("Enter the name of the company you have the most shares in:");
            String companyName = scan.nextLine();

            System.out.println("Enter the value of those shares?");
            double companyValue = scan.nextDouble();

            double companyShares = (totalShares/totalValue)*companyValue;

            System.out.println("Your total stock market holding is $"+ totalValue +" which is made up of " + totalShares +" shares. "+companyName + " is the largest company holdings you have of $"+ companyValue+ " between "+ companyShares+" shares.");

        }else{
            System.out.println("Invalid input!");
        }

    }
}
