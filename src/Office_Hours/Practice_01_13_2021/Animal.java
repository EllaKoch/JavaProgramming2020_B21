package Office_Hours.Practice_01_13_2021;

public abstract class Animal {// only for common for all subclasses features

    public String name, size;
    public final String breed;
    public final char gender;
    public int age;

    public static boolean isAnimal;

    protected abstract void speak();
    protected abstract void play();


    public Animal(String name, String breed, String size, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
