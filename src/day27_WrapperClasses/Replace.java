package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        arr = replace(arr,2,30);
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------");

        String[] arr2={"Java", "Python", "C++", "Raika"};
        arr2=replace(arr2,2,"yasin");

        System.out.println(Arrays.toString(arr2));
    }

    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }
            array[index] = newElement;
        return array;
    }
    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
}
