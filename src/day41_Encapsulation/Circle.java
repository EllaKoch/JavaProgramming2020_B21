package day41_Encapsulation;

public class Circle {

    private double radius, diameter, area, perimeter;
    private final static double PI;

    static {
        PI = Math.PI;// final cannot be changed
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    private double calculateArea() {
        return radius * radius * PI;
    }

    private double calculatePerimeter(){
        return diameter*PI;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }


    public void setRadius(double radius) {
        this.radius = radius;
        diameter = radius*2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }



}
