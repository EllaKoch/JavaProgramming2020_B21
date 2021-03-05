package day53_Collection;

import java.util.*;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Ella", 130000d);
        employeeInfo.put("Afrooz", 130000d);// key HAS to be Unique
        employeeInfo.put("Ayse", 125000d);

        System.out.println(employeeInfo.size());

        System.out.println("Salary of Afrooz: "+employeeInfo.get("Afrooz"));
        System.out.println("Salary of Ella: " + employeeInfo.get("Ella"));

        employeeInfo.remove("Afrooz");
        System.out.println(employeeInfo.size());

        System.out.println(employeeInfo.containsKey("Ella"));// returns boolean
        System.out.println(employeeInfo.containsKey("Ayse"));

        System.out.println(employeeInfo.containsValue(125000d));// checks exact valuehas to match the dataType of Value else reurns false

        //employeeInfo.clear();// clears all map data
       // System.out.println(employeeInfo);

        System.out.println("===========================================================");
        // get all the keys and value from the map
       for(String eachKey :employeeInfo.keySet()) {
           System.out.println(eachKey +": "+ employeeInfo.get(eachKey));
       }


        System.out.println("===========================================================");
        employeeInfo.put("Mustafa",105000.0);
        employeeInfo.put("Emre",103000.0);
        employeeInfo.put("Apo",100000.0);

        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        String nameMax = "", nameMin = "";
        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);
            if(eachSalary>max){
                 max = eachSalary;
                 nameMax = eachName;
            }

            if(eachSalary<=min){
                min = eachSalary;
                nameMin = eachName;
            }
        }
        System.out.println(nameMax+" : " + max);
        System.out.println(nameMin+ " : " + min);


        System.out.println("=================================================");

        System.out.println(employeeInfo);


        employeeInfo.values().forEach(  p -> {// same as for each below
            System.out.println(p);
        } );

        // same as for each above
        for (Double eachValue : employeeInfo.values()) {
            System.out.println(eachValue);
        }


        employeeInfo.keySet().forEach(p->{
            System.out.println(p);
        });


        List<Double> salaries = new ArrayList<>(employeeInfo.values());
        System.out.println(salaries);



    }






}
