package Office_Hours.Practice_02_03_2021;

import java.time.LocalDate;
import java.util.*;

/*
Task:

    EmployeeName | Hired Date
      John           2017-5-1
      Erjon          2021-4-1
      Afrooz         2020-3-1
      Haroon         2019-2-1
      Aysel          2018-1-1
      .....
      displayed the Employee name and hire date of the employees who were hired before 2019

 */
public class MapPractice {
    public static void main(String[] args) {

        TreeMap<String, LocalDate> employees = new TreeMap<>();

        employees.put("John", LocalDate.of(2017, 5, 1));
        employees.put("Erjon", LocalDate.of(2021, 4, 1));
        employees.put("Afrooz", LocalDate.of(2020, 3, 1));
        employees.put("Haroon", LocalDate.of(2019, 2, 1));
        employees.put("Aysel", LocalDate.of(2018, 1, 1));

        for (String eachKey : employees.keySet()) {//names
            LocalDate eachValue = employees.get(eachKey);// dates
            if(eachValue.isBefore(LocalDate.of(2019,1,1))){
                System.out.println("Hired Before 2019: "+eachKey+ " : " + eachValue);
            }

            if(eachValue.isAfter((LocalDate.of(2019, 1,1)))){
                System.out.println("Hired After 2019: "+eachKey+ " : " + eachValue);
            }

        }

        System.out.println("====================================================");

        List<Map<String, Integer>> list = new ArrayList<>();










    }
}
