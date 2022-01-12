package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicDate = 100;
    static int defaultData =200; // access modifier: default
    private static int privateData =300;

    public static void main(String[] args) {
        System.out.println(publicDate);
        System.out.println(defaultData);
        System.out.println(privateData);
    }

}
