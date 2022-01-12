package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int temporary = b; // temporary=15

        b = a; //b=10
        a = temporary; // a=15



        System.out.println("a = " + a);
        System.out.println("b = " + b);


        System.out.println("5+2 = " + (3+4));

    }
}
