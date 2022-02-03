package day43_Abstraction.Car;

public class Audi extends Car{


    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");

    }
}
