package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 85;

        String result = (s >= 0  && s <= 100)? (s >= 60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);

        System.out.println("-------------");

       String re = (s >= 0  && s <= 100)? (s >= 90)? "Excellent" : (s >= 80)? "Great"
               : (s >=70)? "Good" : (s >=60) ? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result);

    }
}
