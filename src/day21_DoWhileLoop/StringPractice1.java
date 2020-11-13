package day21_DoWhileLoop;
import java.util.Scanner;
public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.nextLine();// "Java"


        int lastIndex =  word.length()-1;
       char f = word.charAt(0);//print first character
        char l = word.charAt(lastIndex);

        System.out.println(f+""+l);

        System.out.println("=========================================");

        while (true) {

        System.out.println("Enter your building number: ");
        String building = scan.next();//next()

        scan.nextLine();

        System.out.println("Enter street name: ");
        String street = scan.nextLine();

        System.out.println("Enter apartment number: ");
        String apartment = scan.next();//next()  #

        scan.nextLine();

        System.out.println("Enter the city: ");
        String city = scan.nextLine();//nextLine()

        System.out.println("Enter the state: ");
        String state = scan.nextLine();//nextLine();

        System.out.println("Enter your zipcode: ");
        String zipcode = scan.next();

        String fullAddress = building+" "+ street+ ", Apt# "+ apartment+ "\n"+ city+", "+ state+ " "+zipcode;

        System.out.println(fullAddress);

            System.out.println("Would you like to continue? Yes/No");
            String answer = scan.next();
            if(answer.equalsIgnoreCase("no")){
                break;
            }

        }







    }
}
