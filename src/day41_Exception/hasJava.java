package day41_Exception;

import java.util.Scanner;

public class hasJava {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count = 0;
        String java = "java";


        for( int i = 0; i <= word.length()-java.length(); i++) {


            if(word.substring(i, i+4).equals(java)) {
                count++;
            }
        }
        System.out.println(count);




    }
}

