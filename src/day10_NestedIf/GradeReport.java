package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90 ~100: Exellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69:Passed
        0 ~ 59 :failed
      */
        int score = 80;

        if(score >= 0 && score <= 100){ // if the score is valid
            // 5 possibilities
            if (score >= 90 ) {
                System.out.println("Exellent");
            }else if(score >= 80 ) {
                System.out.println("Great");
            }else if(score >= 70 ){
                System.out.println("Good");
            }else if (score >= 60) {
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ // if the score is NOT valid
            System.out.println("Invalid Score");
        }




    }
}
