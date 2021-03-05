package day47_Abstraction.CarTask;

public class CarShop {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry","White", 2018, 17000);
        Mercedes mercedes = new Mercedes("GL","Black",2018,41000);
        Tesla tesla = new Tesla("S","Blue", 2020, 38000);
        BMW bmw = new BMW("i8","Gray", 2021,147500);

        System.out.println(tesla);

        System.out.println("Start mercedes: ");
        mercedes.start();

        System.out.println("Start Toyota: "); toyota.start();

        System.out.println("Start BMW: "); bmw.start();






    }

}
