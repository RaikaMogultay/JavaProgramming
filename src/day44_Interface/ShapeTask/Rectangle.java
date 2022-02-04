package day44_Interface.ShapeTask;

public class Rectangle extends Shape{

    private double length,width;

    public Rectangle( double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <=0){
            throw new RuntimeException("invalid length"+ length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<= 0){
            throw  new RuntimeException("Invalid width"+ width);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width +length);
    }
}
