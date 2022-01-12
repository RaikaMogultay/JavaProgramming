package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "Java os fun, I love learning Java";

        String str2 = str.replace("Java" , "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSnith@yahoo.com";

        System.out.println("email = " + email);

        String email2 = email.replace("yahoo" , "gmail");
        System.out.println("email2 = " + email2);

        System.out.println("------------");

        String s3 ="Java";

        s3 = s3.replace("a" , "e");

        System.out.println(s3);

        System.out.println("-----------");

        String result = "Java Java Java";

        result =result.replaceFirst("Java" , "Python");

        System.out.println(result);

        String result2 = "C# is fun, C# is cool";

        result2 = result2.replaceFirst("C#" , "Java");

        System.out.println(result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "o");
        System.out.println(result3);









    }
}
