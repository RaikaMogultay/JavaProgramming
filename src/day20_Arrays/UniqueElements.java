package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python","Python"};

        String element = words[0]; // Java
        int frequency = 0;
        for (int i =0; i < words.length; i++) { // finds the finds the frequency from array
            if (words[i].equals(element)) {
                frequency++;

            }
        }
        if (frequency == 1) {
            System.out.println(element);
        }
    }
}
