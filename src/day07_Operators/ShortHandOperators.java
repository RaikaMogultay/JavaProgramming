package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assignment: =
        int number = 100;

        System.out.println("number = " + number); //100

        number = 200;

        System.out.println("number = " + number); //200

        String word = "Java Programming";

        System.out.println("word = " + word); // Java Programming

        word ="Wooden Spoon";

        System.out.println("word = " + word); // Wooden Spoon

        word = "Cydeo";

        System.out.println("word = " + word);

        System.out.println("-------------");

        // Addition Assignment:

        int x =100;

        System.out.println("x = " + x);

        System.out.println(x +200); //300

        // x = x +200;
        x += 200;

        System.out.println("x = " + x);

        String str = "Wooden";

        str += "Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num1 = " + num1);

        num1 += 5.5;

        System.out.println("num1 = " + num1);

        double avaibleBalance = 1000.50;

        //deposit $300
        avaibleBalance +=300; // availableBalance = 1000.50 + 300

        System.out.println("avaibleBalance = " + avaibleBalance);

        System.out.println("-----------------");

        //withdrawing 500$

        avaibleBalance -=500; // availableBalance = 1300.5 - 500

        System.out.println("avaibleBalance = " + avaibleBalance);

        //withdrawing 200$, then depositing 400$

        avaibleBalance -= 200; //available balance = 600.5

        avaibleBalance += 400; //available balance = 1000.5

        System.out.println("avaibleBalance = " + avaibleBalance);

        System.out.println("---------------");

        double salary = 50000.50;

        System.out.println("salary = " + salary);

        salary *= 2;
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge *=1000000;

        System.out.println("dodge = " + dodge);

        System.out.println("---------------");

        double num2 = 25000.0;
         num2 /=2;

        System.out.println("num2 = " + num2);

        System.out.println("------------------");

        double num3 = 100;

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("--------------");

        int amount = 127; //cents

        int quarters = 127 / 25;
        int cents = 127 % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("-------------------");

        int cents2=127;

        cents2 %=25;
        System.out.println("cents2 = " + cents2);












    }
}
