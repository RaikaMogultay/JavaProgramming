package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

public class ReverseArray2 {
    public static void main(String[] args) {

        
    }
    public static int[] reverse(int[] array){
        int[] result ={};

        for (int i = array.length-1; i >=0; i--) {
           result =  ArraysUtility.addElement(result,array[i]);

        }
        return result;
    }
}
