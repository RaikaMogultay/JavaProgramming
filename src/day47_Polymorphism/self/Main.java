package day47_Polymorphism.self;

public class Main {
    public static void main(String[] args) {

        Hayvan hayvan1 = new Hayvan();
        Kedi kedi = new Kedi();
        // Classlar miras aldiklari class'in tum ozelliklerini tasidigi icin miras alinan class'tan(Hayvan) miras alan
        //class(Kedi) nesnesi olusturulabilir.

        Hayvan hayvan = new Kedi();

        Hayvan hayvan2 = new Kedi();
        ( (Kedi)hayvan2).konus();

        Kedi kedi1 =(Kedi)kedi;
       // Kopek kopek = (Kopek)kedi; Is-A yok

        Kopek obj = new At();
        //At obj1 = new Kopek(); // bir ustu up casting yapilir.


        hayvan1.konus();
        hayvan.konus();
        kedi.konus();
    }
}
