package day17_Strings;
import java.util.Scanner;
public class GiftCardTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the item");
        String item = scan.nextLine();


        int giftCardBalance = 100;
        int price = 0;


        if(item.equalsIgnoreCase("Smartphone")){
            price = 300;
        }else if(item.equalsIgnoreCase("Laptop")){
            price = 400;
        }else if(item.equalsIgnoreCase("Charger")){
            price = 15;
        }else if(item.equalsIgnoreCase("USB cable")){
            price = 10;
        }else if(item.equalsIgnoreCase("headphones")){
            price = 30;
        }else if(item.equalsIgnoreCase("Pants")){
            price = 50;
        }else if(item.equalsIgnoreCase("hat")){
            price = 25;
        }else if(item.equalsIgnoreCase("Socks")){
            price = 5;
        }else if(item.equalsIgnoreCase("Blanket")){
            price = 60;
        }else if(item.equalsIgnoreCase("Pillow")){
            price= 40;
        }

        if(giftCardBalance>=price && price!=0){
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCardBalance - price) + "$");
        }else if(giftCardBalance<price && price !=0){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else{
            System.out.println("Invalid item!");
        }

    }
}



