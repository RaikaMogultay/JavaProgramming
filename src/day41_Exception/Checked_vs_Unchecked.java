package day41_Exception;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        // unchecked exception:

        int a = 10;
        int b = 0;

       // System.out.println(a /b);
       // System.out.println("Wooden Spoon");

        char[] characters = { 'A', 'B', 'C'};
        //                     0    1    2

        //System.out.println(characters[99]); // 99 uzunlugu olmadigi icin unchecked exception

        String str = "Wooden Spoon";

       // str = null;

        //System.out.println(str.toUpperCase());

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty());



        // checked Exception:

        System.out.println("Hello");

        //   Thread.sleep(3000); // checked

        System.out.println("Cydeo");


        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); // unchecked
















    }

}

/*

    \\ Exceptions
    -an unwanted or unexpected event
    -occurs during the compile time or during the runtime
    - there are two categories of exceptions: checked exception and unchecked exception
    - to prevent exceptions from crash our program, we must write code that detects and handles them
    \\Unchecked Exceptions
    -exceptions that are not checked at compile time.
    -occurs during the runtime
    -code will compile even if we do not handle them
    -they have IS a relationship with runTimeException(parent class)
    \\Checked Exceptions
    -Exceptions that are checked at compile time.
    -occurs during the compile time
    -Code will not compile even if we do not handle them
    -They do not have IS a relationship with RunTimeException class

     */
