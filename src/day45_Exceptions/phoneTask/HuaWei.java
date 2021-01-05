package day45_Exceptions.phoneTask;

public final class HuaWei extends Phone {


    public HuaWei(String model, double price) {
        super("HuaWei", model,"China",price);
    }

    public void spy(){
        System.out.println(brand+ " " + model+" is spying");
    }
}
