package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmupTask1 {
    public static void main(String[] args) {
//1. use the LocalDate & Time get the date and time in the following format:
//            Tuesday, 1:00 pm, Nov/24/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, hh:mm a, MMMM/dd/yyyy");

        LocalDateTime d1 = LocalDateTime.of(2020,11,24, 13,0);

        System.out.println( d1.format(dtf).replaceFirst("PM", "pm") );

        System.out.println("=====================================================");
        /*

    2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each Date in the following formar:
                MonthName/Day, Name
                ex:
                    November/25, Wednesday

 */

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd, E");
        LocalDate[]  days  = new LocalDate[5];

        for (int i = 0; i <= days.length-1; i++){
            days[i] = LocalDate.now().plusDays(i+1);//i+1 is to start from tmrw
        }

        System.out.println(Arrays.toString(days));


        for(LocalDate each  : days ){
            System.out.println(each.format(df));
        }


        System.out.println("=====================================================");
// find youungest and oldest from array

        String[] names = {"Ella", "Bella", "Amina", "Asya", "Lily"};

        LocalDate[] DofB = {
                LocalDate.of(1991,9,25),
                LocalDate.of(1990,11,23),
                LocalDate.of(1995,02,10),
                LocalDate.of(2005,03,20),
                LocalDate.of(2010,05,25)
        };

            String nameOfOlder = names[0];
            LocalDate older = DofB[0];

        String nameOfYounger = names[0];
        LocalDate younger = DofB[0];

            for(int i = 0; i<=DofB.length-1; i++){

                if(DofB[i].isBefore(older)){
                    older = DofB[i];
                    nameOfOlder = names[i];
                }
                if(DofB[i].isAfter(younger)){
                    younger=DofB[i];
                    nameOfYounger = names[i];
                }
            }
        System.out.println(nameOfOlder+" : " + older);
        System.out.println(nameOfYounger+" : " + younger);


    }
}
