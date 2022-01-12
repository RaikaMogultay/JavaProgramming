package day09_IfStatement;

public class NameOfDay {
    public static void main(String[] args) {

        int n = 5;

        if (n==1){
            System.out.println("Monday");
        }
        if (n==2) {
            System.out.println("Tuesday");
        }
        if (n==3){
            System.out.println("Wednesday");
        }
        if (n==4){
            System.out.println("Thursday");
        }
        if (n==5){
            System.out.println("Friday");
        }
        if (n==6){
            System.out.println("Satuday");
        }
        if (n==7){
            System.out.println("Sunday");
        }

        int day = 7;

        String dayName;

        if (day == 1){
            dayName= "Monday";
        }else if (day ==2 ) {
            dayName ="Tuesday";
        }else if (day ==3) {
            dayName ="Wednesday";
        }else if (day ==4 ) {
            dayName = "Thursday";
        }else if (day ==5) {
            dayName = "Friday" ;
        }else if (day ==6) {
            dayName ="Saturday" ;
        } else if (day== 7) {
            dayName = "Sunday";
        }else {
            dayName ="invalid";
        }
        System.out.println(dayName);


    }
}
