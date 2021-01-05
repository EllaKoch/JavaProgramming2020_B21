package day44_Inheritance.CarTask;

public class CarObjects {
    public static void main(String[] args) {

        Honda honda = new Honda("Civic", "white", 35000, 2019);

        honda.start();
        System.out.println(honda);


        Mercedes mercedes = new Mercedes("Benz", "Burgundy", 15000, 2000);

        mercedes.start();
        System.out.println(mercedes);


        Jeep jeep = new Jeep("Rubicon", "Green", 50000, 2020);

        jeep.start();
        System.out.println(jeep);

        Tesla tesla = new Tesla("Model Y", "white", 100000, 2020 );

        tesla.start();
        System.out.println(tesla);


    }
}
