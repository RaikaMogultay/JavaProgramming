package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 65;

        boolean num1 = number % 2 == 0;
        boolean num2 = number % 3 == 0;
        boolean num3 = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + num1);
        System.out.println(number + " is divisible by 3: " + num2);
        System.out.println(number + " is divisible by 5: " + num3);


        System.out.println("--------------------");

        int year =2000;

        boolean isLeapYear = year % 4 ==0;

        System.out.println(year + " is leap year" + isLeapYear);





    }
}
