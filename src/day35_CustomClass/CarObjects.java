package day35_CustomClass;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();// has its own brand

        Car car2 = new Car();// has its own brand

        Car car3 = new Car();// has its own brand

        car1.brand = "Toyota";// copy1
        car2.brand = "BMW";// copy2
        car3.brand = "Lexus";// copy3
        System.out.println(car1.brand);
        System.out.println(car2.brand);
        System.out.println(car3.brand);

        String str1 = "Toyota";
        String str2 = "BMW";
        String str3 = "Lexus";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);


        car1.model = "Corolla";
        car2.model = "i8";
        car3.model = "RX";
        System.out.println(car1.model);
        System.out.println(car2.model);
        System.out.println(car3.model);


        Car car4 = new Car();
        car4.setInfo("Mercedes", "C300");
        System.out.println(car4.brand);
        System.out.println(car4.model);



    }


}