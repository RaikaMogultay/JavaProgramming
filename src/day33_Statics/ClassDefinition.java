package day33_Statics;

import java.util.ArrayList;

public class ClassDefinition {
    String favColor; // java put defaults when no access modifier is specified
    private int age; // access modifier private; only accessible into the same class
    protected String name; // protected can be acessible in class and package
    public String lastName; // public is accessible in everywhere

    public ClassDefinition(String favColor, int age, String name, String lastName) {
        this.favColor = favColor;
        this.age = age;
        this.name = name;
        this.lastName = "MOGULTAy";
    }



    public static void main(String[] args) {
        String obj1 = "A";
        String obj2 = "B";
        obj1 = obj2;
        obj2 = null;
        
    }


}