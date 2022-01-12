package day32_Constructors;

public class ConstructorsCalls {

    public ConstructorsCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorsCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorsCalls(String str){
        this(10); //Default Constructor ,  Constructor with int argument
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorsCalls obj1 = new ConstructorsCalls();

        System.out.println("----------------------------");

        ConstructorsCalls obj2 = new ConstructorsCalls(10);

        System.out.println("----------------------------");

        ConstructorsCalls obj3= new ConstructorsCalls("Java");


    }
}
