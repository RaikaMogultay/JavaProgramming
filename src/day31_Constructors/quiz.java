package day31_Constructors;

public class quiz {
    public quiz(){
        System.out.println("A");

    }
    public quiz(int a){
        this();
        System.out.println("B");

    }
    public quiz(String str){

        this(100);
        System.out.println(str);

    }


    public static void main(String[] args) {
        quiz obg = new quiz();
    }
}
