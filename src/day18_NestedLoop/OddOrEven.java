package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num %2 == 0){
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }
            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();

//            while () {
//                System.out.println("Please re enter, Would you like to enter another number?");
//                a = scan.next();
            }
//            if (a.equals("no")) {
//                break;
//            }
        }

    }

