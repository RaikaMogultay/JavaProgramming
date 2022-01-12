package day05_Concatenation;

public class Variables_Practice {

    public static void main(String[] args) {
        byte num1 = 100;
        short num2 = 10000;
        double num3 = 3.5;
        float num4 = 2.5F;
        long num5 = 9999999999999L;
        int num6 = 850000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

        float a = 100.987_6543F;
        short b = (byte)a;
        byte c = (byte)b;

        System.out.println(c);

        long aa = 30L;
        long bb =(short)aa;

        System.out.println(bb);





    }
}
