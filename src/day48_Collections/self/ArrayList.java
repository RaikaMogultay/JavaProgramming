package day48_Collections.self;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList isimler = new java.util.ArrayList();

        isimler.add("Raika");
        isimler.add("Yasin");
        isimler.add("Maya");
        isimler.add(25);
        isimler.add(true);

        System.out.println(isimler);

        System.out.println("index: " + isimler.indexOf("Yasin"));

        boolean varMi= isimler.contains("Raika");
        System.out.println(varMi);

        System.out.println(isimler.get(2));

        System.out.println(isimler.remove(1));

        System.out.println(isimler.size());

        //isimler.clear();
        //System.out.println(isimler);

   java.util.ArrayList<String> isim = new java.util.ArrayList<>(); // just String

   // <> isaretleri icerine liste icinde tutmak istedigimiz veri tipini yazabiliriz, Eger ilker veri tipi eklemek istersek
        //(tam sayi, boolean gibi ozaman primitive data type lar icin olustulan wrapper classlarini kullanmaliyiz.
        // int -> Integar
        //boolean -> Boolean

        java.util.ArrayList<Integer> sayilar = new java.util.ArrayList<>();
        sayilar.add(25); // just sayi


        List<String> liste = new java.util.ArrayList<>();

        liste.add("Hamza");
        liste.add("Berk");
        liste.add("Erdal");

        liste.add(0,"Ayse"); // sifirinci indexe eklmeek istedim.

        liste.add(2,"Burak");

        liste.remove(2);
        liste.remove("Erdal");


        //Eklenme sirasina gore
        for (int i=0; i<liste.size(); i++){
            System.out.println(liste.get(i) + " ");
        }

        // Eklenme sirasinin tersine gore..

        for (int i= liste.size()-1; i >=0; i--){
            System.out.println(liste.get(i) + " ");
        }

        //for each yardimi ile..
        for (Object listeler: isimler){
            System.out.println(listeler+ " ");
        }







    }
}

//add():verileri eklemek icin
//get(): verileri almak icin
//contains(): herhangi bir datanin liste icersinde olip olmadigini bize soyler.
//remove(): verileri silmek icin
//size(): arraylist icerisinde kac tane data oldugunu bize vericek.
//clear(): tum elemenlari listeden temizler.
//indexOf: Datanin liste icerisndeki index numarasini verir.
