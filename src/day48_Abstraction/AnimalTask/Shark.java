package day48_Abstraction.AnimalTask;

public final class Shark extends Animal implements Swimmable, Predator{
    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }



    @Override
    public void sleep() {
        System.out.println("Shark sleeps for 6 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Sharks hunt for fish");
    }

    @Override
    public void swim() {
        System.out.println("Sharks swim for long hours");
    }
}
