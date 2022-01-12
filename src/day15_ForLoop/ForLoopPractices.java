package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        /*
        System.out.println(15);
        System.out.println(16);
        ...
        System.out.println(45);
         */

        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("===============");

        for(int a = 100; a >= 50; a--)
            System.out.print(a + " ");

        System.out.println();
        System.out.println("===================");

        //print all the even numbers between 1 ~55

        for (int e =1; e <= 55; e++) {

            if (e % 2 == 0){
                System.out.print(e + " ");
            }
        }

        System.out.println();
        System.out.println("=================");

        // print all the even numbers between 1~55

        for (int ee = 2; ee <= 54; ee +=2) {
            System.out.print(ee + " ");
        }


        /*
        A~Z
        a~z
        Z~A
        z~a
         */
    }
}
