package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 3
        numbers.add(40); // 4
        numbers.add(50); // 5
        numbers.add(60); // 6

        numbers.add(2,25); //2
        numbers.add(5,45); //5

        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);
        System.out.println("num = " + num);

        System.out.println("-------------------");

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Raika");

        list.set(2,"JavaScript");
        list.set(3,"Yasin");

        System.out.println(list);

        System.out.println("-------------------");

        ArrayList<String> employess = new ArrayList<>();

        employess.add("Raika");
        employess.add("Yasin");
        employess.add("Aysima");
        employess.add("Cinar");
        employess.add("Arden");
        employess.add("Maya");
        employess.add("Bora");

        System.out.println(employess);

        employess.remove(4);
        System.out.println(employess);




    }
}
