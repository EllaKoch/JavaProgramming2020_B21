package day17_Strings;//100% good code
/*
 Doctor appointment
    - Ask the user how many days they have been sick(byte)
        > If they have been sick for 1-3 days
        print "Drink water and get some rest, but we can schedule an appointment for next week"
        > If they have been sick for 4-7 days print "We can schedule an appointment for two days"
        > If they have been sick for more than 7 days print "Come in immediately"
    - Ask the user if they are taking any medicine (String - yes or no)
        > If they are taking medicine ask them what kind of medicine
        they are taking (String, multiple words)
        > If they are not, ask them if they think they need any (String - yes or no)
            > If they say yes print "We can prescribe medicine after the appointment"
            > If they say no print "Eat some soup"
    - Ask the user if they have insurance (boolean)
        > If they have insurance(true) print "Okay see you at the appointment"
        > If they don't have insurance (false) print "Okay we can discuss
        payment after the appointment"

 */

import java.util.Scanner;

public class DoctorTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many days have you been sick?");
        byte numOfSickDays = scan.nextByte();

        if (numOfSickDays > 0) {

            if (numOfSickDays <= 3) {
                System.out.println("Drink water and get some rest, but we can schedule an appointment for next week");
            } else if (numOfSickDays <= 7) {
                System.out.println("We can schedule an appointment for in two days");
            } else {
                if (numOfSickDays > 7) {
                    System.out.println("Come in immediately");
                }
            }
            System.out.println("Are you taking any medicine? Yes/No");
            String yesOrNo = scan.next();

            scan.nextLine();

            if (yesOrNo.equalsIgnoreCase("yes")) {
                System.out.println("What kind of medicine are you taking?");
                String kindOfMeds = scan.nextLine();

            } else {
                System.out.println("Do you think you need to take any medicine? Yes/No");
                yesOrNo = scan.nextLine();

                if (yesOrNo.equalsIgnoreCase("yes")) {
                    System.out.println("We can prescribe medicine after the appointment");
                } else {
                    System.out.println("Eat some soup");
                }
            }

            System.out.println("Do you have insurance? True/False");
            boolean haveInsurance = scan.nextBoolean();

            if (haveInsurance == true) {
                System.out.println("Okay see you at the appointment");
            } else {
                System.out.println("We can discuss payment after the appointment");
            }

        } else {
            System.out.println("Invalid number of days you have been sick");
        }

    }
}

//
//                String haveInsurance = scan.next();
//
//
//                if (haveInsurance.equalsIgnoreCase("yes")) {
//                    System.out.println("Okay see you at the appointment");
//                } else {
//                    System.out.println("Okay we can discuss payment after the appointment");
//                }

