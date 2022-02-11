package day45_Interface.shape;

public class Cylinder extends Shape implements Volume{

    private double radius;
    public final static double pi=3.14;
    private double height;



    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0) throw new RuntimeException("Invalid radius "+radius);
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<=0)throw new RuntimeException("Invalid height "+height);
        this.height = height;
    }

    @Override
    public double area() {
        return 2*pi*radius*height+2*pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*(2*radius+height);
    }

    @Override
    public double volume() {
        return pi*radius*radius*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
