package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i ==3) {
               // break; // terminated the loop
                // continue; // terminated the current iteration of the loop
                System.exit(0); // terminated the program
            }
            System.out.println(i);

        }
        System.out.println("Wooden Spoon");


    }
}
