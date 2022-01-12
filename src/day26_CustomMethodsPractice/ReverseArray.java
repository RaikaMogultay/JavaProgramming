package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] result = reverse(arr);

        System.out.println(Arrays.toString(result));

    }

    // reverses the given array, returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        int j =0;

        for (int i = array.length-1; i >=0 ; i--) {
           result[j++] = array[i];
        }
        return result;



    }
}
