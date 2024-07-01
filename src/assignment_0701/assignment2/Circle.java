package assignment_0701.assignment2;

public class Circle extends Shape{

    private double radius;

    public Circle() {

    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    void calculationArea() {
        setArea(this.radius * this.radius * Math.PI);
    }
}
