package Office_Hours.Practice_12_09_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();
        Carpet carpet3 = new Carpet();
        Carpet carpet4 = new Carpet();
        Carpet carpet5 = new Carpet();

        carpet1.setInfo(5.5, 6, 55, true);
        carpet2.setInfo(4.5, 4, 75, false);
        carpet3.setInfo(3.5, 3.5, 100, true);
        carpet4.setInfo(7, 7, 500, true);
        carpet5.setInfo(8, 8, 30, false);

        Carpet[] carpets = {carpet1, carpet2, carpet3, carpet4, carpet5};

        ArrayList<Carpet> regular = new ArrayList<>();
        ArrayList<Carpet> persian = new ArrayList<>();

        for (Carpet each : carpets) {
            if (each.isPersian) {
                persian.add(each);
            } else {
                regular.add(each);
            }
        }
        for (Carpet each : regular)
            System.out.println("Regular Carpets: " + each);

        for (Carpet each : persian)
            System.out.println("Persian Carpets: " + each);


    }
}
