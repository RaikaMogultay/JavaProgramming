package day30_CustomClass;

import java.util.ArrayList;


public class Dog {

    public String name;
    public String bread;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        dogBreed = dogBreed;
        age = dogAge;
        gender= dogGender;
        size = dogSize;
        color = dogColor;
    }


    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark() {
        System.out.println(name + " is barking");

    }
}
