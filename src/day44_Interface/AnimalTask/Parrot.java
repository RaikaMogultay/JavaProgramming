package day44_Interface.AnimalTask;

public final class Parrot extends Animal {
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

        System.out.println(getName() + " eating chocolate");

    }
}
