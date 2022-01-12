package day14_String;

public class StringMethods3 {
    public static void main(String[] args) {

        String word = "Cydeo School";
        String brand =word.substring(0);
        System.out.println(brand);

        String st1 = word.substring(6);
        System.out.println(st1);

        System.out.println("-------------");

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" ")); //Java
        String s2 = word2.substring( word2.indexOf(" ")+1, word2.lastIndexOf(" ") );
        String s3 = word2.substring(word2.lastIndexOf(" ")+1 );


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
