package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Toyota", "Camry", "White", 2017, 10000);
        //car1.getInfo();

        car2.setInfo("Honda", "Accord", "Silver", 2015, 35000);
        //car2.getInfo();

        car3.setInfo("Jeep", "Cherokee","Neon", 2000, 70000 );


        car4.setInfo("BMW","M3", "Black",2003,12000);


        car5.setInfo("Honda", "Civic", "pink", 1999, 1300);

        Car[] cars = { car1, car2, car3, car4, car5};

        for(Car each :cars){
            each.getInfo();
        }


        System.out.println("===================================================");

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(cars));

        carList.removeIf(p -> p.price <25000 );// we removed all the cars that are under 25K

        for(int i = 0; i <= carList.size()-1; i++){
            carList.get(i).getInfo();
        }



    }


}
