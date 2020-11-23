package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class LocalDateTask {
    public static void main(String[] args) {

        String[] names = {"Nina", "Magomed", "Arthur", "Laura", "Bella"};

        LocalDate[] birthDays = {
                LocalDate.of(1962,8,6),
                LocalDate.of(1955,5,5),
                LocalDate.of(1984, 5,11),
                LocalDate.of(1987,8,13),
                LocalDate.of(1991,4,2)  };


        for(int i = 0; i <=birthDays.length-1; i++){
            System.out.println(names[i]+ "'s birthday is: "+ birthDays[i]);

            System.out.println(names[i] + " was born on leap year: " + birthDays[i].isLeapYear());
        }



    }



}
