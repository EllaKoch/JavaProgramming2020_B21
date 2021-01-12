package day47_Abstraction.ShapeTask;

public abstract class Shape {// generic word/ Not concrete
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();// private/static/final methods cannot be abstract!!!
    public abstract double perimeter();



}