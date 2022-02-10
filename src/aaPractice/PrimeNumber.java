package aaPractice;

public class PrimeNumber {

    public static void main(String[] args) {

        prime(7);

       /* if (isPrime(11))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(15))
            System.out.println(" true");
        else
            System.out.println(" false");
    }

        */


    }

    public static boolean prime(int number) {
        int m = 0;
        int flag = 0;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not prime number");
            return false;
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not prime number");
                    flag = 1;
                    break;
                }

            }
        }
        System.out.println(number + " is prime number");
        return true;
    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


}
