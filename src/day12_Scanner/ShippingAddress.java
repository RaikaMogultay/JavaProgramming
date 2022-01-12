package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine(); // Java Programming

        System.out.println("Enter your building number:");
        String buildingNumber = scan.next(); // 316

        scan.nextLine();

        System.out.println("Enter your Street name:");
        String streetName = scan.nextLine();

        System.out.println("Enter your City name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        System.out.println("Enter your zip code: ");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println("Enter your country name: ");
        String countryName = scan.nextLine();

        scan.close();
        


















    }
}
