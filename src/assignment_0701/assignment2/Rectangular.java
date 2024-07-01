package assignment_0701.assignment2;

public class Rectangular extends Shape{
    private double width;
    private String height;

    public Rectangular() {

    }

    public Rectangular(String name, double width, String height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    @Override
    void calculationArea() {
        setArea(width * Integer.parseInt(height));
    }
}
