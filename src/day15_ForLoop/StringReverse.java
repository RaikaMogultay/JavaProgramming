package day15_ForLoop;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");

        String str = scan.next();

        String result = "";

        for (int i = str.length()-1; i>= 0; i--){

            result +=str.charAt(i);

        }

        System.out.println(result);




    }
}
/*
7. Write a program that can reverse any given string
			Ex:
				input:
					Wooden Spoon
				output:
					noopS nedooW
 */
