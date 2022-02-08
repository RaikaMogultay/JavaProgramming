package day44_Interface.Animal;

public class Duck extends Animal implements Flyable, Swimmable{

    public Duck(String breed, String name, String color, String size, char gender) {
        super(breed, name, color, size, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating food");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking");
    }

    @Override
    public void fly() {

        System.out.println(getName() + " can swim");

    }
}
