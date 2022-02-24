package day48_Collections.self;

import java.util.LinkedList;

public class LinkList {

    public static void main(String[] args) {

        LinkedList liste = new LinkedList();

        liste.add("Raika");
        liste.add("Yasin");
        liste.add("Maya");
        liste.addFirst("Mogul");
        liste.addLast("Engin");

        System.out.println(liste);

        liste.remove("Engin");
        liste.remove(0);

        System.out.println(liste);

        System.out.println(liste.get(2));

        System.out.println(liste.size());

        LinkedList<String> list = new LinkedList<>(); // just String

        list.add("Sukur");
        list.add("Sabir");
        list.add("Bereket");

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(list.get(i));

        }
        for (String isim:list) {
            System.out.println(isim);

        }












    }
}
//LinkedList(Bagli listeler)
//add():
//addFirst();
//addLast();
//remove();
//removeFirst();
//removeLast();
//get();