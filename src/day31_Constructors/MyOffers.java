package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();

        offer1.setInfo("Dallas", "Apple", "SDET", 11000, true, true, true, true);

        Offer offer2 = new Offer();

        offer2.setInfo("Dallas", "Walmart", "SDET", 80000,true, true, true, true);

        Offer offer3 = new Offer();

        offer3.setInfo("NYC", "WholeFoods", "SDET", 90000, true, true, true, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);

        System.out.println("---------------------------------------------------------");

        Offer[] myOffers= {offer1,offer2,offer3};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);
        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !p.location.equals("Dallas"));
        System.out.println(localOffers.size());






    }
}
