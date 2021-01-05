package day45_Exceptions.phoneTask;

public class Phone extends Device {


    public Phone(String brand, String model, String country, double price) {
        super(brand, model, country, price);

    }

    @Override
    public String toString() {
        return "Phone" + super.toString();
    }

    public void call(long number) {
        System.out.println(brand + " " + model + " is calling " + number);
    }

    public void text(long number) {
        System.out.println(brand + " " + model + " is texting " + number);
    }


}

