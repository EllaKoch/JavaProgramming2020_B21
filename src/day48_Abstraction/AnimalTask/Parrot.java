package day48_Abstraction.AnimalTask;

public class Parrot extends Animal implements Flyable, Playable{
    public Parrot(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);

    }

    @Override
    public void sleep() {
        System.out.println("Parrots sleep around 4 hours ");
    }

    @Override
    public void fly() {
        System.out.println("Parrots can fly for 1 hour");
    }

    @Override
    public void play() {
        System.out.println("Parrots play with humans");
    }
}
