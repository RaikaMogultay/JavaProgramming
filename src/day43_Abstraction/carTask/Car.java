package day43_Abstraction.carTask;

public abstract class Car {

    private String brand, model;
    private String color;
    private int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        setYear(year);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <1886){
            throw new RuntimeException("Invalid year:" + year);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <0){
            throw new RuntimeException("Invalid price:" + price);
        }
        this.price = price;
    }

    public void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
