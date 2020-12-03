package day36_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BankOfAmerica {// Bank Of America HAS an Employee

    public static void main(String[] args) {


        String companyName = "Bank of America";
        //Scanner scan = new Scanner(System.in);// Has A relationship

        Employee[] employees = {
                new Employee(),
                new Employee(),
                new Employee(),
                new Employee(),
                new Employee()
        };

        employees[0].setInfo("Elvira", 'F', "Developer", companyName, "123456", 400_000, LocalDate.of(2018, 04, 15));
        employees[1].setInfo("Brad Pitt", 'M', "Scrum Master", companyName, "2345", 21345, LocalDate.of(2016, 9, 14));
        employees[2].setInfo("John Paul", 'M', "SDET", companyName, "120000", 34563, LocalDate.of(2006, 2, 18));
        employees[3].setInfo("Obi-Wan Kenobi", 'M', "BA", "USAA", "164000", 34567, LocalDate.of(1976, 02, 14));
        employees[4].setInfo("John Snow", 'M', "CEO", companyName, "240000", 34563, LocalDate.of(2006, 2, 18));


        for (Employee each : employees) {
            each.getInfo();
        }

        System.out.println("=====================================================");
        ArrayList<Employee> SDETsAndDev = new ArrayList<>(Arrays.asList(employees));

        SDETsAndDev.removeIf(p -> !(p.jobTitle.equalsIgnoreCase("sdet") || p.jobTitle.equalsIgnoreCase("developer")));
        //removes the employess IF job Title of employee is NOT SDET or NOT Developer

        for (Employee each : SDETsAndDev) {
            System.out.println(each.name + " : " + each.jobTitle + ", $" + each.salary);
        }


        System.out.println("=====================================================");

        ArrayList<Employee> richPeople = new ArrayList<>();
        richPeople.addAll(Arrays.asList(employees));
        // for(Employee each : employees) richPeople.add(each);

        richPeople.removeIf(p -> p.salary < 200000);// remove the employee, if employee's salary is less than 200000

        System.out.println("=====================================================");

        double maxSalary = employees[0].salary;// assume that first employess;s salary is max

        String name = "";
        for (Employee each : employees) {
            // maxSalary =  Math.max(maxSalary,each.salary);
            if (each.salary > maxSalary) {//if any employee has greater salary than assign to them
                maxSalary = each.salary;
                name = each.name;
            }
        }

        System.out.println(name + ": "+maxSalary);


    }
}
