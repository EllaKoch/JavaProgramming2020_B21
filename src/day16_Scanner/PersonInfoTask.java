package day16_Scanner;
import java.util.Scanner;
public class PersonInfoTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.next();

        System.out.println("Enter your last name:");
        String lastName = input.next();

        System.out.println("Are you currently employed? True/False");
        boolean isEmployed = input.nextBoolean();

        double salary = 0;

        if(isEmployed){
            System.out.println("What is your salary");
            salary = input.nextDouble();

        }
        input.close();
        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Salary: " + salary);
    }
}
