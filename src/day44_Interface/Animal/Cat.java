package day44_Interface.Animal;

public class Cat extends Animal implements Flyable{

    public Cat(String breed, String name, String color, String size, char gender) {
        super(breed, name, color, size, gender);
    }

    @Override
    public void eat() {

        System.out.println(getName() + " is eating cat food");

    }

    @Override
    public void drink() {

        System.out.println(getName() + " drinking ");

    }


    @Override
    public void fly() {

    }
}
