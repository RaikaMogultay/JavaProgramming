package day48_Collections.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Iterator {
    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>();
        isimler.addAll(Arrays.asList("Burcu", "Nesrin", "Busra"));

        java.util.Iterator iterator = isimler.iterator();

        System.out.println(iterator.hasNext()); // sonraki data var mi?

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());





    }
}
// hasNext()= oge var mi
// next()= bir sonraki ogeye getirir
// remove() = o anki ogeyi siler.
