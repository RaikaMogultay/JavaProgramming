package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = scan.next();

        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a"); // "acodex
        }
        System.out.println(word);


    }
}
