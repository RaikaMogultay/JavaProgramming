package aaPractice;

public class Fibonacci {
    public static void main(String[] args) {

    }

    public int fibonacci(int n){
        int result =0;
        int x =0;
        int y =1;

        for (int i=1; i<n; i++){
            result= x+y;
            x=y;
            y=result;
        }
        return result;

    }
}
