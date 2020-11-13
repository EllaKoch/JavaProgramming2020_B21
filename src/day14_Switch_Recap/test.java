package day14_Switch_Recap;

public class test {
    public static void main(String[] args) {
        String houseType = "Town house";
        int maxOccupants =1;

        switch (houseType){

            case "Tree House":
                maxOccupants = 1;
                break;
            case "Mobile home":
                maxOccupants = 2;
                break;
            case "Apartment":
                maxOccupants = 4;
                break;
            case " Town house":
                maxOccupants = 6;
                break;
            case "Villa":
                maxOccupants = 8;
                break;
            case "Manson":
                maxOccupants = 10;
                break;
            default:
                maxOccupants = 0;


        }

        System.out.println("Number of max occupants: " +maxOccupants);





    }
}
