package day42_Inheritance.AnimalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, int age, String color, String size) {
       setInfo(breed, color, name, size, gender, age);// constructor in subclass and call setInfo
    }

    public void bark(){
        System.out.println(name + " is barking");
    }










}
