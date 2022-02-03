package day43_Abstraction.Car;

public class CarShop {

    public static void main(String[] args) {

        Audi audi = new Audi("x5","Black",2020,-2);
        Honda honda = new Honda("Accord", "red", 2021, 35000);

        honda.start();
        audi.start();

    }
}
