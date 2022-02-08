package aaPractice;

import java.util.Scanner;

public class LongestStringFromArray {
    public static void main(String[] args) {

        String[] names = {"Raika", "Aziza", "Igor", "Vesela", "Malgorzata", "Nurcan", "Nilufar", "Layla"};

        String longest = longestString(names);

        System.out.println(longest);

    }

    public static String longestString(String[] names) {

        int maxLength =names[0].length();

        String longestString = "";

        for (String each: names){
            if (each.length() > maxLength){
                maxLength=each.length();
                longestString =each;
            }
        }
        return longestString;


    }
}

/*Write a Java program to find the longest string from a given String array and print that string?

 */
