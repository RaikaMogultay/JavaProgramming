package day31_Constructors;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 30);

        Person person2 = new Person("Ayse", 'F', 40);

        person2.age = 20;

        System.out.println(person1);
        System.out.println(person2);

    }
}
