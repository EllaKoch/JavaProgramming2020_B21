package day16_Scanner;
import java.util.Scanner;
public class PointsTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of people you live with:");
        byte numOfPeople = input.nextByte();

        int points = 0;

        if (numOfPeople >= 0 && numOfPeople <= 12) {
            if (numOfPeople <= 2) {
                points++;// or point += 1
                // or just print this instead of points System.out.println("You live with less than 2 people");
            } else if (numOfPeople < 7) {//include people 3-6
                points += 2;
            } else {// include 7 -12
                points += 3;
            }
        } else {
            System.err.println("Not a valid number of people");
            input.close();
        }

        System.out.println("Enter which city you live in:");
        String city = input.next();

        System.out.println("Do you live in downtown area? Yes/No");
        String area = input.next();

        String moveSuburbs = "";

        switch (area) {
            case "yes":
            case "Yes":
                System.out.println("Would you consider moving to suburbs? Yes/No");
                moveSuburbs = input.next();
                points++;
                break;
            case "No":
            case "no":
                System.out.println("OK");
                points--;
                break;
            default:
                System.out.println("Invalid answer");
                input.close();
        }

        System.out.println("What your favorite animal?");
        String favAnimal = input.next();



        System.out.println("How many pets do you want?");
        int pets = input.nextInt();


        input.close();

        System.out.println("I see that you live with "+ numOfPeople +" person/people in " + city + " city");
        System.out.println("You live in downtown: " + area);

        switch (moveSuburbs){
            case "No":
            case "no":
                System.out.println("You consider moving to suburbs: No");
                break;
            case"yes":
            case"Yes":
                System.out.println("You consider moving to suburbs: Yes");
                break;
            default: System.out.println("Invalid answer");
        }

        System.out.println("Your favorite animal is: " + favAnimal);
        System.out.println("You would like to own " + pets + " pet(s)");
        System.out.println("You've got " + points + " point(s)");

    }
}
/*
    Count up some points based on the users input:
    Ask the user how many people they live with?
        if user lives with Less than 2 people: add one point
        if the user lives with 3 - 6 people: add two points
        if the user lives with more than 6 people: add three points
    Ask the user what city they live in?
    Ask the user if the live in downtown ("yes or no")
        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
            if they have thought about it, add one point
            if no, minus one point
    Ask the user their favorite animal?
    Ask the user how many pets they want?
    Print everything and points
 */