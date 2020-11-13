package day05ArithmeticOperators;

public class ConcatinationPractice {

    public static void main(String[] args) {

        int houseNumber = 7925;
        String streetName = "Federalist Way";
        String cityName = "Fairfax";
        String state = "VA";
        int zipcode = 20302;

        String fullAddress = houseNumber+" "+streetName+", \n"+cityName+", "+state+" "+zipcode;

        System.out.println(fullAddress);

        System.out.println("========================================");

        String brand = "BMW";
        String model = "X7";
        int year = 2012;
        short milage = 20000;
        double price = 45000;
        String color = "Red";


        String carInfo = year+" "+brand+" "+model+", "+milage+ " "+"miles" + ", "+color+", "+"$"+price;
        System.out.println(carInfo);
        System.out.println();

        System.out.println("hello" +(2+3)+9);//conc vs addition



    }
}
