package day23_CustomMethods_Void;

public class CustomMethodsParameters {
    public static void main(String[] args) {
        oddOrEven(10);
        ageOfPerson(1995);
    }

    //create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){

        if(number % 2 ==0){
            System.out.println(number+ " is even number");

        }
    }
    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age = 2021-birthYear;
        System.out.println("Your age is: " +age);
    }
}
