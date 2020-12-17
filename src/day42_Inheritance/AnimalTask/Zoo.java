package day42_Inheritance.AnimalTask;

public class Zoo { // zoo HAS A tiger
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan", "bengal tiger", 'M', 5, "Orange", "large");


        System.out.println(tiger);

        tiger.eat("chicken");

        tiger.hunt();
        tiger.roar();
        tiger.drink("water");


        Cat cat = new Cat("Kara Murza", "wild", 'M', 3, "black and white", "medium");

        System.out.println(cat);

        cat.eat("tuna");
        cat.drink("milk");
        cat.meow();
        cat.sleep();

        Dog dog = new Dog("Nina","American bull dog",'F',2,"White and brown","Big");

        System.out.println(dog);

        dog.eat("chicken");




    }
}
