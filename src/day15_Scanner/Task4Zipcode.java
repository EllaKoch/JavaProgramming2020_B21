package day15_Scanner;
import java.util.Scanner;
public class Task4Zipcode {
    public static void main(String[] args) {
        Scanner zipcode = new Scanner(System.in);

        System.out.println("Please, enter your zipcode");

        long zip = zipcode.nextLong();

        System.out.println("Please, enter the number of people you live with");

        byte roomMates = zipcode.nextByte();

        System.out.println("Please, answer the following question: True/False");
        boolean isMarried = zipcode.nextBoolean();

        if (isMarried == true){
            System.out.println("I see that you are married and live with " + roomMates +" person/people in your house located at " + zip + " area.");
        }else{
            System.out.println("I see that you are not married and live with " + roomMates +" person/people in your house located at " + zip + " area.");
        }
    }
}
/*
Ask the user to enter their zipcode (long),
the number of people they live with (byte),
 if they are married or not (boolean - true for married/false for not)
 and print the values in the following format:
    "I see you are $marriedOrNot! and live with $peopleNum
    people in your house which is in the $zipcode area! "
    Ex: 31009, 4, false --> I see you are not married
    and live with 4 people in your house which is in the 31009 area!

 */