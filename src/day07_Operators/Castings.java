package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 20.5f;

        byte num1 = (byte)averageScore ;
        short num2 = (short)averageScore;
        int num3 = (int)averageScore;
        float num4 = averageScore ;
        double num5 = averageScore;
        long num6 = (long)averageScore;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);;
    }
}
