package day15_Scanner;
/*
Ask the user to enter their age (byte),
 ask them to enter their favorite number (long),
 and ask them if they are a student (boolean).
 Print all the values from the inputs

 */
import java.util.Scanner;
public class Scanner_PersonalInfo {
    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Please enter your age");

        byte age = info.nextByte();

        System.out.println("Please enter your favorite number");

        long favNum = info.nextLong();

        System.out.println("Are you a student? Enter True or False");

        boolean isStudent = info.nextBoolean();

        System.out.println("Age: " + age);
        System.out.println("Favorite number: " + favNum);
        //System.out.println("Is a student: " + isStudent);

        if(isStudent){
            System.out.println("Great, you are a student!");
        }else{
            System.out.println("Oh okay, you are not a student");
        }




    }
}


/*
 Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = input.nextInt();

        if(number%2 == 0){
            System.out.println(number + " is even.");
        }else{
            System.out.println(number+ " is odd.");
        }

        System.out.println("Enter your age: ");

        byte age = input.nextByte();
        System.out.println("Your age is: " + age);


        System.out.println("Enter your favorite number: ");
        long favNumber = input.nextLong();
        System.out.println("Your favorite number is: " + favNumber);

        System.out.println("Are you a student? True/ False");

        boolean isStudent = input.nextBoolean();

        if (isStudent == true){
            System.out.println("You are a student");
        }else{
            System.out.println("You are not a student");
        }

 */