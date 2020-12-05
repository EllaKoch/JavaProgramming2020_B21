package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLot {// HAS A relation

    public static void main(String[] args) {



        Car[] cars = { new Car(),new Car(),new Car(),new Car(),new Car()};

        cars[0].setInfo("BMW", "i8", "Black",
                LocalDate.of(2020,05,20),
                20000, 10000);

        cars[1].setInfo("BMW", "i8", "Black",
                LocalDate.of(2015,05,20),
                20000, 10000);

        cars[2].setInfo("BMW", "x5", "Black",
                LocalDate.of(2016,05,20),
                20000, 10000);

        cars[3].setInfo("BMW", "i8", "Black",
                LocalDate.of(2017,05,20),
                20000, 10000);

        cars[4].setInfo("BMW", "m4", "Black",
                LocalDate.of(2019,05,20),
                20000, 10000);


        System.out.println("===============================================");
        //recall all BMW that were built before 2017

        ArrayList<Car> recall1 = new ArrayList<>();// to store the result

        for(Car each : cars){
            if(each.brand.equals("BMW") && each.year < 2017){
                recall1.add(each);
            }
        }
        System.out.println(recall1);

        System.out.println("==============================================");

        // recall all bmw i8 that were built before 2016

        ArrayList<Car> recall2 = new ArrayList<>();

       for(Car each : cars){
           if(each.brand.equals("BMW")){
               if(each.model.equals("i8") && each.year < 2016){
                   recall2.add(each);
               }
           }
       }
        System.out.println("recall2 = " + recall2);

        System.out.println("==============================================");

        ArrayList<Car> myCollection = new ArrayList<>(Arrays.asList(cars));
        //myCollection.addAll(Arrays.asList(cars));

        // remove all the cars that are not BMW m4
        myCollection.removeIf(p -> !( p.brand.equals("BMW") && p.model.equals("m4")));

        System.out.println(myCollection);









    }




   // ArrayList<Car> cars = new ArrayList<>();











}
