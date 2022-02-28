package day48_Collections.self;

import java.util.HashSet;

public class Set {

    public static void main(String[] args) {

        HashSet liste = new HashSet();

        liste.add("Raika");
        liste.add("Yasin");
        liste.add(25);
        liste.add("Maya");
        liste.add("Raika");

        System.out.println(liste);
        System.out.println(liste.contains(25));

        System.out.println(liste.isEmpty());

        liste.remove("Maya"); // index yazamayiz.

        System.out.println(liste.size());

        Object[] array = liste.toArray();





    }
}
// kume mantiginda olusturulan liste.
//.add();
// sirali degildir.
//ayni datayi yazdirmaz.
//.clear();
//.contains();
