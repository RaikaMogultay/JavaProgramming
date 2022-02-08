package aaPractice;

import day44_Interface.Animal.Java;

import java.util.Arrays;

public class RemoveMultipleStringArray {

    public static void main(String[] args) {


 String[] array = {"Hello  world  ", " Java is   fun ", " I love   Java  "};

 String result = removeSpaces(array);

        System.out.println(result);


    }

    public static String removeSpaces(String sentence){

        String[] arr = sentence.split("");

        String result = "";

        for (String each : arr){
            if (!each.isBlank()){
                result +=each +"";
            }
        }

        return result.trim();
    }

    public static String removeSpaces(String[] array){

        String result = "";
        for (String each : array){
            result += removeSpaces(each) + "\n";

        }
        return result;
    }
}


/*Write Java metod to remove multiple spaces from a string Array, and print in new line each element.
Ex: array = {" Hello  world  ", " Java   is   fun ", " I love   Java  "};
Output: Hello world
		Java is fun
		I love Java

 */
