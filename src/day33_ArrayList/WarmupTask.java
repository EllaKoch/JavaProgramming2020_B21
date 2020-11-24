package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
1. use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020

 */
public class WarmupTask {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        //System.out.println(today);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MM/dd/yyyy");
        System.out.println(today.format(dtf));


        // task 2
        /*
         2. create an array of LocalDate and store the next 10 day's dates,
          use for each loop to print each Date in the following formar:
                MonthName/Day, Name
                ex:
                    November/25, Wednesday

         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMMM/dd, EEEE");


        for(int i = 1; i <=10; i++){
            LocalDate t = LocalDate.now();
            System.out.println(t.plusDays(i).format(dtf1));
        }











    }
}
