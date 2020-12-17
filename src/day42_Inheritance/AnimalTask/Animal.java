package day42_Inheritance.AnimalTask;

public class Animal {

    public String breed, color, name, size;
    public char gender;
    public int age;


    public void setInfo(String breed, String color, String name, String size, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.size = size;


    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drinks){
        System.out.println(name + " drinks "+ drinks);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }


    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
