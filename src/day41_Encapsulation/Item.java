package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
   public String name;
   public double unitPrice, quantity;


    public Item(String name, double unitPrice, double quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return quantity*unitPrice;
    }



    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity= " + quantity +
                ", total price: $"+ calcCost()+
                '}';
    }
}

 class ShoppingList{
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Item item1 = new Item("milk",5.5, 1);
        Item item2 = new Item("bread",4.5, 1);
        Item item3 = new Item("cokie",7.5, 2);
        Item item4 = new Item("eggs",4, 1);
        Item item5 = new Item("cheese",3.5, 4);

        items.addAll(Arrays.asList(item1,item2,item3, item4, item5));

        System.out.println(items);

        double total = 0;
        for(Item eachItem : items){
            eachItem.calcCost();
            total+=eachItem.calcCost();
        }

        System.out.println(total);

    }
}



/*
create a class called Item
            instance variables:
                name, unitPrice, quantity
            add a constructor that can initialize the fields
            instance methods:
                calcCost(): returns the total cost as double
                            hint: totalCost = quantity * unitPrice
                toString(): returns the name, unit price, quantity and total cost
                 info as calculated by calcCost()
    create a class called ShoppingList
            create 5 objects of Item and store them into ArrayList of Items

            calculate the total cost of all Items in the list

 */