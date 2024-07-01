package assignment_0701.assignment2;

public class TestShape {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];
        shapes[0] = new Circle("원", 10);
        shapes[1] = new Rectangular("직사각형", 20, "10");

        for (Shape shape : shapes) {
            shape.calculationArea();
            shape.printArea();
        }
    }
}
