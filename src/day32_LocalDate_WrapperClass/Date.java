package day32_LocalDate_WrapperClass;
import java.time.LocalDate;
public class Date {
    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020,11,22);

        System.out.println(yesterday);

        LocalDate d1 = LocalDate.of(2020,2,29);

        System.out.println(d1);

        System.out.println(yesterday.isLeapYear()); // year%4==0 ==> leap Year

        LocalDate today = LocalDate.now();
        System.out.println(today);


    }
}
