package day14_Switch_Recap;

public class taskHouse {
    public static void main(String[] args) {
        String house = "Mobile hom";
        int max = 0;
        switch (house){
            case "Tree house":
                max = 1;
                break;
            case "Mobile home":
                max = 2;
                break;
            case "Apartment":
                max = 4;
                break;
            case "Town house":
                max = 6;
                break;
            case "Villa":
                max = 8;
                break;
            case "Mansion":
                max = 10;
                break;
            default:
                max = 0;

        }
        System.out.println("The number of max occupants is: " + max);
    }
}
/*
Given a house type (String) print out the number of max occupants (int)
    Tree house: 1
    Mobile home: 2
    Apartment: 4
    Town house: 6
    Villa: 8
    Mansion: 10

 */