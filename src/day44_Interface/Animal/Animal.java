package day44_Interface.Animal;

public abstract class Animal {
    private String breed, name, color, size;
    private char gender;

    public Animal(String breed, String name, String color, String size, char gender) {
        setBreed(breed);
        setName(name);
        setColor(color);
        setSize(size);
        setGender(gender);
    }

    public String getBreed() {
        return breed;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
    public char getGender() {
        return gender;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setName(String name) {
        if (name.isBlank() || name.isEmpty() || name == null){
            throw new RuntimeException("Not negative");
        }
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void eat();

    public abstract void drink();

    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                '}';
    }
}
