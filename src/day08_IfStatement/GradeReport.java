package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

        int score = 85; // 0 ~ 100

        boolean a = score >= 90 && score <=100;
        boolean b = score >= 80 && score <= 89;

        // boolean b = sscore >= 80 && !a// if score is A, but score is A, but score is greater than 80

        boolean c = score >= 70 && score <=79;

        boolean d = score >=60 && score <=69;

        boolean f = score >=0 && score <=59;

        if(a) {
            System.out.println("Exvcellent");
        }
        if (b) {
            System.out.println("Great");
        }
        if (c) {
            System.out.println("Good");
        }
        if (d) {
            System.out.println("Passed");
        }
        if (f) {
            System.out.println("Failed");
        }








        /* System.out.println(true == !false);
        System.out.println(!true != false);
        System.out.println(!false ==true); */
    }
}
