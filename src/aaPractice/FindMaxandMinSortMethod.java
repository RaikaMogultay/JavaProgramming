package aaPractice;

import java.util.Arrays;

public class FindMaxandMinSortMethod {

    public static void main(String[] args) {

        int[] numbers = {8, 9, 17, 5, 4, 1};

        Arrays.sort(numbers);

        System.out.println("max: " + numbers[0]);
        System.out.println("min: " + numbers[numbers.length-1]);

    }

}
/*Write a method that can find the max and min number from an int array without using sort method.
  Ex: arr = {8, 9, 17, 5, 4, 1};
  max = 9;
  min = 1;

 */
