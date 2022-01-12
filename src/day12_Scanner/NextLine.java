package day12_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your Programming Language:");
        String programming = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();


        System.out.println("fullname = " + fullName);
        System.out.println("Programming = " + programming);
        System.out.println("Age = " + age);
        System.out.println("school name = " + schoolName);
    }
}
