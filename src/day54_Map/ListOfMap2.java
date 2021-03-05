package day54_Map;

import java.time.LocalDate;
import java.util.*;

public class ListOfMap2 {
    public static void main(String[] args) {

        String[] family = {"Nina", "Magomed", "Artur", "Laura"};
        LocalDate[] DOBFamilyMembers = {LocalDate.of(1962, 8, 6),
                LocalDate.of(1962, 8, 6),
                LocalDate.of(1955, 5, 5),
                LocalDate.of(1984, 5, 11),
                LocalDate.of(1987, 8, 13)};


        String[] classMates = {"Kate", "Miray", "Agalar", "Ana"};
        LocalDate[] DOBClassMates = {LocalDate.of(1962, 8, 6),
                LocalDate.of(1962, 8, 6),
                LocalDate.of(1955, 5, 5),
                LocalDate.of(1984, 5, 11),
                LocalDate.of(1987, 8, 13)};

        String[] friends = {"Jamoliddin", "Bella", "Amina", "Mary"};
        LocalDate[] DOBFriends = {LocalDate.of(1962, 8, 6),
                LocalDate.of(1986, 7, 2),
                LocalDate.of(1991, 4, 18),
                LocalDate.of(1991, 5, 25),
                LocalDate.of(1983, 4, 18)};

        List<Map<String, LocalDate>> listOfMap = new ArrayList<>(Arrays.asList());

        listOfMap.addAll(Arrays.asList(
                new LinkedHashMap<>(),//for family members
                new LinkedHashMap<>(),//class mates
                new LinkedHashMap<>()// friends
        ));


        for (int i = 0; i < family.length; i++) {
            listOfMap.get(0).put(family[i], DOBFamilyMembers[i]);

        }
        for (int i = 0; i < classMates.length; i++) {
            listOfMap.get(1).put(classMates[i], DOBClassMates[i]);

        }

        for (int i = 0; i < friends.length; i++) {
            listOfMap.get(2).put(friends[i], DOBFriends[i]);

        }
        System.out.println(listOfMap);


        System.out.println("======================================");

        for (Map.Entry<String, LocalDate> each : listOfMap.get(0).entrySet()) {// get(0) for family members
            String eachName = each.getKey();
            LocalDate eachDOB = each.getValue();

            if (eachDOB.isBefore(LocalDate.of(1994, 1, 1))) {
                System.out.println(eachName);
            }

        }


        System.out.println("=======================================================================");


        String[] modelOfToyota = {"Camry", "Rav4", "Corolla", "Land Cruiser", "Highlander"};//5
        Integer[] yearOfToyota = {2001, 1965, 2015, 1968, 2020};//5

        String[] modelOfBMW = {"M1", "M3", "M5"};//3
        Integer[] yearOfBmw = {1995, 2005, 2015};//3

        String[] modelOfMercedes = {"C-Class", "A-Class", "SLS", "GLC"};//4
        Integer[] yearOfMercedes = {1990, 1995, 2015, 2021};//4


        List<Map<String, Integer>> carCollection = new ArrayList<>();
        carCollection.addAll(Arrays.asList(
                new TreeMap<>(),// for mercedes
                new TreeMap<>(),//for toyota
                new TreeMap<>()// for BMW
        ));


        for (int i = 0; i < modelOfToyota.length; i++) {
            carCollection.get(1).put(modelOfToyota[i], yearOfToyota[i]);
        }

        for (int i = 0; i < modelOfMercedes.length; i++) {
            carCollection.get(0).put(modelOfMercedes[i], yearOfMercedes[i]);
        }

        for (int i = 0; i < modelOfBMW.length; i++) {
            carCollection.get(2).put(modelOfBMW[i], yearOfBmw[i]);
        }
        System.out.println(carCollection);

        for (Map.Entry<String, Integer> eachMerc : carCollection.get(0).entrySet()) {
            String mercModel = eachMerc.getKey();
            Integer mercYear = eachMerc.getValue();
            if (mercYear >= 1990 && mercYear <= 1998) {
                System.out.println(mercModel + ": " + mercYear + " is eligible for recall!");
            }
        }
        System.out.println("===========================");

        for (Map.Entry<String, Integer> eachToyota : carCollection.get(1).entrySet()) {
            String toyotaModel = eachToyota.getKey();
            Integer toyotaYear = eachToyota.getValue();
            if (toyotaYear >= 1960 && toyotaYear <= 1970) {
                System.out.println(toyotaModel + " : " + toyotaYear + " is eligible for recall!");
            }
        }
        System.out.println("===========================");

        for (Map.Entry<String, Integer> eachBmw : carCollection.get(2).entrySet()) {
            String bmwModel = eachBmw.getKey();
            Integer bmwYear = eachBmw.getValue();
            if (bmwYear >= 2011 && bmwYear <= 2015) {
                System.out.println(bmwModel + " : " + bmwYear + " is eligible for recall!");
            }
        }

        System.out.println("===========================");
        System.out.println("Cars eligible for recall: ");
        for (int i = 0; i < carCollection.size(); i++) {
            Map<String, Integer> eachMap = carCollection.get(i);
            for (Map.Entry<String, Integer> eachPair : eachMap.entrySet()) {
                int year = eachPair.getValue();

                if (i == 0) {//Mercedes
                    if (year >= 1990 && year <= 1998) {
                        System.out.println(eachPair);
                    }
                } else if (i == 1) {//Toyota
                    if (year >= 1960 && year <= 1970) {
                        System.out.println(eachPair);
                    }
                } else if (i == 2) {//BMW
                    if (year >= 2011 && year <= 2015) {
                        System.out.println(eachPair);
                    }
                }
            }

        }
    }

    // System.out.println(carCollection);

        /*
        eligible to recall:
        BMW:
        2011 - 2015

        Mercedes:
        1990_ 1998

        Toyota:
        1960 - 1970

         */


}

