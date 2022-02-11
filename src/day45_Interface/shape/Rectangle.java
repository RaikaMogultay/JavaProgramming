package day45_Interface.shape;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <=0){
            throw new RuntimeException("Invalid length: " +length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            throw new RuntimeException("Invalid width: " + width);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length +width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
