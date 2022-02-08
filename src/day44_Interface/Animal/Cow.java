package day44_Interface.Animal;

public class Cow extends Animal implements Flyable{
    public Cow(String breed, String name, String color, String size, char gender) {
        super(breed, name, color, size, gender);
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void fly() {

    }
}
