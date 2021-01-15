package day49_Abstraction.ShapeTask;

public final class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
        if (side <= 0) throw new RuntimeException("No such square with a side of: " + side);
        setSide(side);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square " + super.toString();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
