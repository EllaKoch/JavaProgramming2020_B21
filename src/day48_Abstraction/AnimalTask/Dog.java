package day48_Abstraction.AnimalTask;

public class Dog extends Animal implements Playable, Swimmable{
    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps for 8 hours");
    }

    @Override
    public void play() {
        System.out.println("Dogs love to play fetch");
    }

    @Override
    public void swim() {
        System.out.println("Dogs can swim if needed");
    }
}
