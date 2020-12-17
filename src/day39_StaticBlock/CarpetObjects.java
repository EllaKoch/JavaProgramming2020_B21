package day39_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(5,7,15,false);
        carpets[1].customOrder(5,7,15,true);
        carpets[2].customOrder(4,5,30,true);
        carpets[3].customOrder(8,10,12,false);
        carpets[4].customOrder(10,15,13,true);


        ArrayList<Carpet> persianCarpets = new ArrayList<>(Arrays.asList(carpets));

        persianCarpets.removeIf(p -> !p.isPersian);

        System.out.println(persianCarpets);

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));

        regularCarpets.removeIf(p -> p.isPersian);
       // regularCarpets.removeAll(persianCarpets);

        System.out.println("=====================================================");
        double totalPriceOfPersianCarpets = 0;
        for(Carpet each : persianCarpets){
            System.out.println("Persian carpets: " + each);
            totalPriceOfPersianCarpets += each.calcCost();
        }
        System.out.println("totalPriceOfPersianCarpets = " + totalPriceOfPersianCarpets);

        double totalPriceOfRegularCarpets = 0;
        for(Carpet each : regularCarpets){
            System.out.println("Regular carpets: " + each);
            totalPriceOfRegularCarpets+= each.calcCost();
        }

        System.out.println("totalPriceOfRegularCarpets = " + totalPriceOfRegularCarpets);

        double totalPrice = totalPriceOfPersianCarpets+totalPriceOfRegularCarpets;

        System.out.println("Total price of carpets: "+totalPrice);


    }
}
