package day16_Scanner;
import java.util.Scanner;
public class GameCoupon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int itemPrice = 0;

        System.out.println("Enter price in cents:");
        itemPrice = scan.nextInt();

        int change = (100-itemPrice);
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        if (itemPrice >= 25 && itemPrice <= 100) {
            if (itemPrice % 5 == 0) {

                quarters = change/25;
                dimes = (change%25)/10;
                nickels = (change%25)%10/5;

                System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
            } else {
                System.out.println("Invalid price!");
            }
        } else {
            System.out.println("Invalid price!");
        }

    }
}

/*
int itemPrice = 0;

        System.out.println("Enter price in cents:");
        itemPrice = scan.nextInt();

        int quarters = 25;
        int dimes = 10;
        int nickels = 5;



        if (itemPrice >= 25 && itemPrice <= 100) {
            if (itemPrice % 5 == 0) {

                if (itemPrice == 100) {
                    quarters = 0;
                    dimes = 0;
                    nickels = 0;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 95) {
                    quarters = 0;
                    dimes = 0;
                    nickels = 1;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 90) {
                    quarters = 0;
                    dimes = 1;
                    nickels = 0;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 85) {
                    quarters = 0;
                    dimes = 1;
                    nickels = 1;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 80) {
                    quarters = 0;
                    dimes = 2;
                    nickels = 0;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 75) {
                    quarters = 1;
                    dimes = 0;
                    nickels = 0;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 70) {
                    quarters = 1;
                    dimes = 0;
                    nickels = 1;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 65) {
                    quarters = 1;
                    dimes = 1;
                    nickels = 0;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 60) {
                    quarters = 1;
                    dimes = 1;
                    nickels = 1;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 55) {
                    quarters = 1;
                    dimes = 2;
                    nickels = 0;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 45) {
                    quarters = 2;
                    dimes = 0;
                    nickels = 1;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 40) {
                    quarters = 2;
                    dimes = 1;
                    nickels = 0;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else if (itemPrice == 35) {
                    quarters = 2;
                    dimes = 1;
                    nickels = 1;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");

                } else if (itemPrice == 30) {
                    quarters = 2;
                    dimes = 2;
                    nickels = 0;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                } else {
                    quarters = 3;
                    dimes = 0;
                    nickels = 0;
                    System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
                }

            } else {
                System.out.println("Invalid price!");
            }
        } else {
            System.out.println("Invalid price!");
        }

 */