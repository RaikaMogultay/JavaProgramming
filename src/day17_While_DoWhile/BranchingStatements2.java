package day17_While_DoWhile;

import jdk.swing.interop.SwingInterOpUtils;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;
            }
            System.out.println(i); // A B D E
        }

        System.out.println("----------------------");
        // print all even number 1~10 (skip the odd numbers)

        for (int i = 1; i <11; i++) {
            if (i % 2 != 0) {  // 1, 3, 5, 7, 9
                continue; // Skip
            }
            System.out.println(i);
        }

        System.out.println("----------------------");
        //print all odd number between 1~10 (skip the even numbers

        for (int i = 1; i< 11; i++) {
            if (i % 2 ==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
