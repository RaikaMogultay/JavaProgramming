package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alphabets = new char[26]; // Z~A

        /*        i     ch
        alphabets[0] = 'Z';
        alphabets[1] = 'Y';
        alphabets[2] = 'X';
                ...

        char ch = 'Z';
        for (int i =0; i< alphabets.length; i++, ch--) {
            alphabets[i] = ch;
        } */

        for (char i =0, j = 'Z'; i < alphabets.length; i++, j--){
            alphabets[i] = j;

        }

        System.out.println(Arrays.toString(alphabets)); // print the whole array

       // System.out.println(alphabets[0]); // printing the element of array



    }
}
