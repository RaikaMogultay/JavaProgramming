package aaPractice;

public class OddOrEven {
    public static void main(String[] args) {
        oddEven(5);
    }

    public static int oddEven(int num){

        if (num%2==0){
            System.out.println(num + " is even number");

        }else {
            System.out.println(num + " is odd number");
        }
      return num;
    }

}
