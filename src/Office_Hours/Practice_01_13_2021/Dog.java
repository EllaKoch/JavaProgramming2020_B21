package Office_Hours.Practice_01_13_2021;

public final class Dog extends Animal {

    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }


    public void speak(){
        System.out.println("Woof woof");
    }

    @Override
    protected void play() {
        System.out.println("fetch");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }

    @Override
    public String toString() {
        return "Dog"+super.toString();
    }
}
