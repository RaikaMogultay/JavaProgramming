package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
        boolean a = false;

        for (int i = 0; a;) {
            System.out.println("Wooden Spoon -- for loop");
        }
        System.out.println("--------");

        while (a) {
            System.out.println("Wooden spoon -- while lop");
        }
        System.out.println("--------");

        do {
            System.out.println("Wooden spoon -- while");
        }while(a);
    }
}
