package day45_Interface.shape;

public class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;
    private double height;

    public Triangle(double side1, double side2, double side3, double height) {
        super("Triangle");
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
        setHeight(height);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return side2*height;
    }

    @Override
    public double perimeter() {
        return side1 + side2 +side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString() +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", height=" + height +
                '}';
    }
}
