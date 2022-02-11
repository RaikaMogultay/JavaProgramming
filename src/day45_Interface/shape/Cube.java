package day45_Interface.shape;

public class Cube extends Shape implements Volume{

    private double e;

    public Cube(double e) {
        super("cube");
        setE(e);
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        if (e<=0){
            throw new RuntimeException("Invalid edge");
        }
        this.e = e;
    }

    @Override
    public double area() {
        return 6*e*e;
    }

    @Override
    public double perimeter() {
        return 12*e;
    }

    @Override
    public double volume() {
        return e*e*e;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString() +
                "e=" + e +
                '}';
    }
}
