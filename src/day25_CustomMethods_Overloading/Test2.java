package day25_CustomMethods_Overloading;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("-------------------");

        double[] arr2 = {1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("-------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("-------------------");

        String[] arr4 = {"Raika", "Yasin", "Arden"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("-------------------");

        int[] n1={1,2,3,4,5,6};
        int max1 = ArraysUtility.max(n1);

        System.out.println("max1 = " +max1);

        System.out.println("-------------------");

        double[] n2= {2.4,1.3,5.6,9.5,9.2};
        double max2= ArraysUtility.max(n2);

        System.out.println("max2 = " + max2);




    }
}
