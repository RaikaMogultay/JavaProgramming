package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable that's capable enough tp contain 5 names

        String[] myGroup = new String[5];
        myGroup[0] = "gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Raika";
        myGroup[3] = "Yasin";
        myGroup[4] = "Maya";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index:           0         1          2             3          4         5            6


        System.out.println(Arrays.toString(days));
        int number = 5;

        if (number < 1 || number >7) {
            System.out.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);


    }
}
