package day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();// dataType in second<> is Optional

        scores.add(100);  // autoboxing   0
        scores.add(200);    //  1
        scores.add(300);    // 3

        scores.add(2, 400);  // 2

        System.out.println(scores);


        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Egg");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");

        groceryList.add(0, "Toilet paper");
        groceryList.add(1, "Sanitizer");
        groceryList.add(1, "Masks");


        System.out.println(groceryList);
        // get(); retrives the element from its index
        String item1 = groceryList.get(2);
        System.out.println("item1 = " + item1);

        String item2 = groceryList.get(1);
        System.out.println("item2 = " + item2);


        //size()

        int total = groceryList.size();
        System.out.println("total = " + total);

        System.out.println(groceryList.get(groceryList.size()-1));








    }


}
