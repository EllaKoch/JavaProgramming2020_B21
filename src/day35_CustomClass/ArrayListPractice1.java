package day35_CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/*
 task01:
            1. create an Array of string called country names
            2. write a program that can remove all the country names that have length
             of 10 or greater
    task02:
            1. create an Array of LocalDate
            2. write a program that can remove all the dates before August-15-2016


 */
public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] countryNames = {"Andorra", "United Arab Emirates", "Afghanistan", "Turkey",
                "United States", " Antigua and Barbuda", "Albania", "Colombia", "Venezuela",
                "Panama", "United Kingdom", "Mexico ", "United States"};

        ArrayList<String> countries = new ArrayList<>(Arrays.asList(countryNames));
        System.out.println(countries);

        // Predicate<String> length10 = p -> p.length() > 9;

        countries.removeIf(p -> p.length() >= 10);
        System.out.println(countries);


        System.out.println("=========================================================");
        LocalDate[] arr1 = {LocalDate.of(2010, 11, 23),
                LocalDate.of(2014, 11, 23),
                LocalDate.of(2018, 7, 23),
                LocalDate.of(2007, 12, 8)};


        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(dates);

        LocalDate d1 = LocalDate.of(2016, 8, 15);

        dates.removeIf(p -> p.isBefore(d1));

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd-yyyy, EEE");//or MMMM-dd-yyyy, EEEE
        for(LocalDate each : dates){
            System.out.println(each.format(df));
        }
        System.out.println(dates);


        System.out.println("================================================");







    }
}
