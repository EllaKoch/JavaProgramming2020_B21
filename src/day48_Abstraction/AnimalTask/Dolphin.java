package day48_Abstraction.AnimalTask;

public class Dolphin extends Animal implements Swimmable, Playable, Predator{

    public Dolphin(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphins don't sleep, but rest");
    }

    @Override
    public void play() {
        System.out.println("Dolphins can swimm 10 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Dolphins hunt for fish");
    }

    @Override
    public void swim() {
        System.out.println("Dolphins can swim");
    }
}
