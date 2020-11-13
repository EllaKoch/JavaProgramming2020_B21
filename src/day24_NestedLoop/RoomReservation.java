package day24_NestedLoop;

import java.util.Scanner;

/*
 2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculates
             the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outer loop need to be an infinite loop
 */
public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //saim way
//        double totalPrice = 0;
//
//        System.out.println("Do you want to reserve a room?");
//        String yesOrNo = scan.next();
//
//        while (yesOrNo.equalsIgnoreCase("yes")) { // YES NO yeS nO Yes
//
//            System.out.println("Which bed type do you want?");
//            String bedType = scan.next().toLowerCase();  // king, queen, single, king bed
//
//            switch (bedType) {
//                case "king":
//                    totalPrice += 120;  // totalPrice = totalPrice + 120
//                    break;
//                case "queen":
//                    totalPrice += 100;
//                    break;
//                case "single":
//                    totalPrice += 80;
//                    break;
//                default:
//                    System.out.println("Invalid room type");
//            }
//
//            System.out.println("Do you want to reserve another room?");
//            yesOrNo = scan.next();
//
//        }
//
//        System.out.println("total price: " + totalPrice);

        // Muhtar way

        int total = 0;


        while(true) {
            System.out.println("Which room would you like to select?");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String word = scan.nextLine().toLowerCase();

            while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {
                System.out.println("Invalid Entry, Please Re-Enter");
                word = scan.nextLine().toLowerCase();
            } // to make sure user selected either the king bed, or queen bed or single bed

            total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

            System.out.println("Would you like to select another room?");
            String a = scan.nextLine().toLowerCase();

            while( !( a.equals("yes") || a.equals("no") ) ){ // while the answer is not valid answer
                System.out.println("Invalid Entry, please re-enter");
                System.out.println("Would you like to select another room?");
                a = scan.nextLine().toLowerCase();
            } // it stops if the answer is either yes or no

            if(a.equals("no")){
                System.out.println("Your total price is: $"+total);
                break;
            }

        }




    }
}
