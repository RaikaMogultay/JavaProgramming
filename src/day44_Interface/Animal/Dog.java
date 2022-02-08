package day44_Interface.Animal;

import jdk.swing.interop.SwingInterOpUtils;

public class Dog extends Animal implements Playable{
    public Dog(String breed, String name, String color, String size, char gender) {
        super(breed, name, color, size, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");

    }

    @Override
    public void drink() {

        System.out.println(getName() + "  is drinking");

    }

    @Override
    public void play() {

        System.out.println(getName() + " loves to play!");
    }


}
