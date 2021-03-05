package day50_Polymorphism;

import day47_Abstraction.PersonTask.Developer;
import day47_Abstraction.PersonTask.Employee;
import day47_Abstraction.PersonTask.Tester;
import day47_Abstraction.PersonTask.UberDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {

        Employee[] employees = {

                new Tester("Jemo", 34, 'M', "Sdet", "1234", 150000),
                new Tester("Mini", 23, 'F', "SDET", "S123", 75_000),
                new Developer("Emre", 30, 'M', "784512", "gkj7", 10000),
                new UberDriver("Levent", 38, 'M', "986532", "5gj", 80000),

        };


        int countTesters = 0;
        int countDevelopers = 0;
        int countUberDrivers = 0;
        for (Employee each : employees) {
            if (each instanceof Tester) countTesters++;

            if (each instanceof Developer) countDevelopers++;


            if (each instanceof UberDriver) countUberDrivers++;


        }
        System.out.println("countTesters = " + countTesters);
        System.out.println("countDevelopers = " + countDevelopers);
        System.out.println("countUberDrivers = " + countUberDrivers);

        System.out.println("==================================");

        ArrayList<Employee> scrumMembers = new ArrayList<>();
        scrumMembers.addAll(Arrays.asList(employees));

        System.out.println(scrumMembers.size());

        scrumMembers.removeIf(p -> p instanceof UberDriver);

        System.out.println(scrumMembers.size());

        System.out.println("======================================================");

        ArrayList<Employee> testers = new ArrayList<>();
        ArrayList<Employee> developers = new ArrayList<>();

        // scrumMembers.forEach(each -> { if(each instanceof Tester) testers.add(each); else developers.add(each); });
        
        for (Employee each : scrumMembers) {
            if (each instanceof Tester) {
                testers.add(each);
            } else {
                developers.add(each);
            }
        }

        System.out.println("testers = " + testers);
        System.out.println("developers = " + developers);

    }

}