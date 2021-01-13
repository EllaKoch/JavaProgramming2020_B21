package Office_Hours.Practice_01_13_2021;

public final class Shark extends Animal{

    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }


    @Override
    protected void speak() {
        System.out.println("doddodo");
    }

    @Override
    public void play() {
        System.out.println("Play with people");
    }

    public void eatHuman(){
        System.out.println("Sharks eat humans");
    }

    @Override
    public String toString() {
        return "Shark" + super.toString();
    }
}
