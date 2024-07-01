package assignment_0701.assignment2;

public abstract class Shape {
    private double area;
    private String name;

    public Shape() {

    }

    public Shape(String name) {
        this.name = name;
    }

    abstract void calculationArea();

    public void print() {

    }

    public double getArea() {
        return area;
    }

    public void printArea() {
        System.out.println(this.name + "의 면적은 " + this.area);
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
