package aaPractice;

import javax.swing.*;
import java.sql.Array;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
//        System.out.println(reverseStr("abc"));
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static String reverseStr(String str){
        // create variable to store reversed version of str
        String reverse ="";

        // iterate over input string from the back with chatAt
        for (int i = str.length()-1; i>=0; i--){
           reverse += str.charAt(i);
        }
        return reverse;
    }

    public static int[] reverseArray(int[] num){
        int j = num.length - 1; //to get last index
        int[] tmpArr = new int[num.length];

        for (int i = 0; i < num.length; i++){
            tmpArr[i] = num[j-i];
        }
        return tmpArr;
    }
}
