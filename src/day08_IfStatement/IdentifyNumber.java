package day08_IfStatement;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 200;

        boolean iDNum1 = 0 < number;
        boolean iDNum2 = 0 > number;
        boolean iDNum3 = 0 == number;

        System.out.println(number + " is positive number: " + iDNum1);
        System.out.println(number + " is negative number: " + iDNum2);
        System.out.println(number + " is zero: " + iDNum3);
    }
}
