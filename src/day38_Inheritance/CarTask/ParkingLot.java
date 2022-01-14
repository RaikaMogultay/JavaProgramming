package day38_Inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Cambry", 2020, 30000,"Gray", 12345);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

        BMW bmw = new BMW("X5", 2020, 67350, "black", 12000);

        System.out.println(toyota);
        System.out.println(tesla);
        System.out.println(bmw);


    }
}
