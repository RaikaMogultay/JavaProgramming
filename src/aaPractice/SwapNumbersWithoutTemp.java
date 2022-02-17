package aaPractice;

public class SwapNumbersWithoutTemp {

    public static void main(String[] args) {


        swapNum(10,20);
    }

    public static void swapNum(int a, int b){

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
