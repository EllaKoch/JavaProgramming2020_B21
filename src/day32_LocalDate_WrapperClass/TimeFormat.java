package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    /*
    LocalDate:
    year:  yy   or  yyyy
    month:  MM (number), MMM (Three letter of month : Aug) MMM(full name)
    day: dd

    name of day: E(three letters)// Mon, Wed; EEEE(full name) Monday

    LocalTime:
    hours: hh
    minutes: mm
    seconds: ss
    am/pm: a
     */

    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yy, EEEE");//MMM/dd/yyyy

        LocalDate today = LocalDate.now();

        System.out.println(today);

        System.out.println(today.format(df));


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();

        System.out.println(now);

        System.out.println(now.format(tf));

        LocalTime t1 = LocalTime.of(23,35,55);
        System.out.println(t1);

        System.out.println(t1.format(tf));

        // Monday, 12:40 PM,  Nov/23/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");

        LocalDateTime dt1 = LocalDateTime.of(2020, 11, 23, 12, 40);

        System.out.println(dt1);
        System.out.println(dt1.format(dtf));


        // create local date for tmrw

        LocalDate tomorrow = LocalDate.of(2020,11,24);
        System.out.println(tomorrow);

        System.out.println(tomorrow.format(df));

        // verify today is before tmrw

        boolean r1 = today.isBefore(tomorrow);
        boolean r2 = today.isAfter(tomorrow);

        System.out.println(r1);
        System.out.println(r2);



        // calculate the age
        // 2020-11-23      2020
        int currentYear = LocalDate.now().getYear();
        LocalDate DofB = LocalDate.of(2000, 5, 19);

        int age = currentYear - DofB.getYear();

        System.out.println(age);

        System.out.println(DofB.plusDays(10));

        LocalDate rightNow = LocalDate.now();

        LocalDate holidayBreak = rightNow.plusDays(2);

        System.out.println(holidayBreak);


        LocalTime time = LocalTime.now();
        LocalTime lunchBreak = time.plusMinutes(15);

        System.out.println(lunchBreak.format(tf));

        System.out.println("===============================================");

        LocalTime classStarts = LocalTime.of(10, 0);
        LocalTime firstBreak = classStarts.plusMinutes(45);
        System.out.println(firstBreak);

        LocalTime secondBreak = firstBreak.plusHours(1);
        System.out.println(secondBreak);

        LocalTime thirdBreak = secondBreak.plusHours(1).plusMinutes(15);
        System.out.println(thirdBreak);

        LocalTime afternoonClass = thirdBreak.plusHours(1).plusMinutes(15);
        System.out.println("Come back at: "+afternoonClass.format(tf));




    }




}
