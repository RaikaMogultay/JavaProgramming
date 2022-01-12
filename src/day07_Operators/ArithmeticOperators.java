package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        int division = num1/num2;
        int remainder = num1%num2;

        // 10 divide by 3 is equal to 3 with a remainder of 1

        System.out.println(num1 + " divide by " + num2 + " is equal to " + num2 + " with a remainder of " + remainder);

        System.out.println(25 % 5);

        System.out.println("----------");

        int a = 5;
        ++a; // pre increment: increases the value by 1 right away

        System.out.println(a); //6

        int b =100;

        System.out.println(++b);

        int c =100;

        System.out.println(c++); // next step , first passes the current value, then increases the value by 1
        System.out.println(c);

        System.out.println("---------");

        int x = 200;
        System.out.println(--x); // pre decrement: decreases the value by 1 right away

        int y = 200;
        System.out.println(y--);
        System.out.println(y);

        int z = 45;

        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        int q =30;

        System.out.println(--q); //29 q=29
        System.out.println(q--); //29 q=28
        System.out.println(q); //28





    }
}
