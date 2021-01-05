package day45_Exceptions.phoneTask;

public class Nokia extends Phone{

    public Nokia(String model, double price) {
        super("Nokia", model, "Finland", price);
    }

    public void selfDefence(){
        System.out.println(brand+ " " + model+ " is for self defense");
    }

    public void breakTheFloor(){
        System.out.println(brand+ " " + model+ " can break the floor");

    }




}





