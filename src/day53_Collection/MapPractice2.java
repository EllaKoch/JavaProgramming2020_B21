package day53_Collection;

import java.time.LocalDate;
import java.util.*;

/*
Tasks:
    1. create a map that can contain student name and student' score
            put 5 of your friends names and their scores
            print out the names of the students who made less than 80

 */
public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Integer> scores = new TreeMap<>();
        scores.put("Ana", 100);
        scores.put("Miray", 99);
        scores.put("Kate", 75);
        scores.put("Vida", 97);
        scores.put("Inna", 98);

        scores.replace("Kate", 79);


        List<String> earlyBirds = new ArrayList<>();// >=80
        List<String> angryBirds = new ArrayList<>(); // <=80

        // scores.keySet().forEach(p-> { if(scores.get(p) >=80) earlyBirds.add(p); else angryBirds.add(p);});

        for (String name : scores.keySet()) {
            int score = scores.get(name);
            if (score >= 80) {
                earlyBirds.add(name);
            } else {
                angryBirds.add(name);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("==========================================================");

        /*
         2. create a map that can contains name and Date Of Birth.
            put 5 of your classmates' names and thier date of birth
            print out the names of the students who were born before 1980 January 1st

         */

        Map<String, LocalDate> birthDays = new LinkedHashMap<>();

        birthDays.put("Jimmy", LocalDate.now());
        birthDays.put("Farzam", LocalDate.of(2010, 2, 2));
        birthDays.put("Ercan", LocalDate.of(2010, 2, 2));
        birthDays.put("Dean", LocalDate.of(1995, 5, 19));
        birthDays.put("Muhtar", LocalDate.of(1976, 5, 16));
        birthDays.put("Ayder", LocalDate.of(1989, 3, 5));

        LocalDate youngest = LocalDate.of(1900, 1, 1);
        String youngestName = "";
        LocalDate oldest = LocalDate.now();
        String nameOld = "";

        for (String name : birthDays.keySet()) {
            LocalDate DOB = birthDays.get(name);
            if (DOB.isBefore(LocalDate.of(1980, 1, 1))) {
                System.out.println(name + " : " + DOB);
            }
            if (DOB.isAfter(youngest)) {// to find the youngest
                youngest = DOB;
                youngestName = name;
            }

            if (DOB.isBefore(oldest)) {// to find the oldest
                oldest = DOB;
                nameOld = name;
            }

        }

        System.out.println("youngest = " + youngest);
        System.out.println("oldest = " + oldest);


    /*
    3. create a map that can contain names of counties and thier capitals
                use for each loop to print out all the capitals

     */

        Map<String, String> countries = new TreeMap<>();

        countries.put("Russia", "Moscow");
        countries.put("USA", "Washington");
        countries.put("Espana", "Madrid");
        countries.put("Germany", "Berlin");
        countries.put("Kyrgyzstan", "Osh");
        countries.put("The Czech Republic", "Prague");
        countries.put("Pakistan", "Islambad");

        System.out.println(countries);

        countries.values().forEach(p-> {
            System.out.println(p.toUpperCase());
        });

        for (String value : countries.values()) {
            System.out.println(value.toLowerCase());
        }

        countries.keySet().forEach(p->{
            System.out.println(countries.get(p));
        });

        //verify
        boolean r1 = countries.get("Russia").equals("Moscow");
        boolean r2 = countries.containsValue("Moscow");

        //find out capital of Germany
        System.out.println(countries.get("Germany"));

        // find out country that has capital of "Osh"

        for (String country : countries.keySet()) {
            String capital = countries.get(country);
            if(capital.equals("Osh")){
                System.out.println(country);
            }
        }

        // find out  which country's  capital is "Washington"

        countries.keySet().forEach(p->{
            if(countries.get(p).equals("Washington")) System.out.println(p); });


        System.out.println("===========================================");
        LinkedHashMap<String, Integer> sdets = new LinkedHashMap<>();
        sdets.put("Ella", 130000);
        sdets.put("Afrooz", 130000);// key HAS to be Unique
        sdets.put("Ayse", 125000);

        for (String key : sdets.keySet()) {
            Integer value = sdets.get(key);// or sdets.replace(sdets.get(key)+500)
            sdets.replace(key, value+500);
        }

        System.out.println("sdets = " + sdets);
    }

}
