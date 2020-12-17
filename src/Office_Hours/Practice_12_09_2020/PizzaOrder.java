package Office_Hours.Practice_12_09_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();

        pizza1.customizeOrder("small", 2, 2, 20);
        System.out.println(pizza1);

        System.out.println("========================================================");

        Pizza[] cybertekPizza = new Pizza[175];

        for(int i = 0; i <= cybertekPizza.length-1; i++) {
            Pizza pizza = new Pizza();
            pizza.customizeOrder("medium", 2, 3, 18);

            cybertekPizza[i] = pizza;

        }

        double total = 0;

        for(Pizza each : cybertekPizza){
            total += each.totalPrice;
        }

        System.out.println("Total Price: " + total);


        System.out.println("========================================================");

        /* 3
        types of orders: medium - 2 cheese topping , 3 peperoni
                        large : 3 cheese , 4 peperoni
                        small: 1 cheese, 2 peperoni

*/

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for(int i = 1; i <=60; i++){
            Pizza medium = new Pizza();
            medium.customizeOrder("medium", 2, 3,18);


            Pizza large = new Pizza();
            large.customizeOrder("large", 3, 4, 18);

            Pizza small = new Pizza();
            small.customizeOrder("small", 1, 2, 18 );

            pizzas.addAll(Arrays.asList(small, medium, large));
        }

        System.out.println("Number of Pizzas: "+pizzas.size());

        double sum = 0;

        for(Pizza eachPizza : pizzas){
           sum += eachPizza.totalPrice;
        }

        System.out.println("Total price of pizzas: "+sum);


    }
}
