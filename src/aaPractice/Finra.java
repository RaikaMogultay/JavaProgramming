package aaPractice;

import java.util.Scanner;

public class Finra {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        finra(num);

    }

    public static void finra(int num){

        for(int i=1; i<=num; i++){

            if (i%15 ==0){
                System.out.println("FINRA");
            }else if(i%3==0){
                System.out.println("Fin ");
            }else if (i%5==0){
                System.out.println("Ra ");
            }else{
                System.out.println(i);
            }
        }

    }


}
