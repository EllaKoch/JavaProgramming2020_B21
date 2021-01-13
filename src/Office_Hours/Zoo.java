package Office_Hours;

import Office_Hours.Practice_01_13_2021.Cat;
import Office_Hours.Practice_01_13_2021.Dog;
import Office_Hours.Practice_01_13_2021.Shark;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("Charlie", "German Shepard", "Large", 'M', 13);
        Shark shark = new Shark("baby", "White", "Large", 'F', 25);
        Cat cat = new Cat("miniboo", "small", "small", 'F', 2);

       // dog.breed = "Husky";  final
        dog.name = "Alex";

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(shark);

        dog.speak();
        cat.play();
        shark.play();
        cat.scratch();
        dog.bark();
        shark.eatHuman();




    }
}
