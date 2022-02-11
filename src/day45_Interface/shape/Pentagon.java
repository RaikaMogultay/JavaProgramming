package day45_Interface.shape;

public class Pentagon extends Shape implements Volume{
    private double side;
    private double height;
    private double apothemLength;

    public Pentagon( double side, double height,double apothemLength) {
        super("Pentagon");
        setSide(side);
        setHeight(height);
        setApothemLength(apothemLength);
    }

    public Pentagon( double side) {
        super("Pentagon");
        setSide(side);
    }

    public double getApothemLength() {
        return apothemLength;
    }

    public void setApothemLength(double apothemLength) {
        if(apothemLength<=0)throw new RuntimeException("Invalid data entered "+apothemLength);
        this.apothemLength = apothemLength;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0)throw new RuntimeException("Invalid side "+side);
        this.side = side;
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
        return (Math.sqrt(5*(5+2*(Math.sqrt(5))))*side*side)/4;
    }

    @Override
    public double perimeter() {
        return 5*side;
    }


    @Override
    public double volume() {
        return 5/2*(apothemLength*side*height);
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                super.toString()+
                "side=" + side +
                ", height=" + height +
                ", apothemLength=" + apothemLength +
                ", volume=" + volume() +
                '}';
    }
}
