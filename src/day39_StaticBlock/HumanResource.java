package day39_StaticBlock;

import day37_CustomClass.Employee;

public class HumanResource {

    public static Employee employee1, employee2, employee3, employee4, employee5;

    static {
        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5 = new Employee();

        employee1.setInfo("Elvira", "Bank of America",
                "QA", "234", "F",40, 65);
        employee2.setInfo("Dua Lipa", "Apple Company", "SDET", "A-0123", "F", 40, 65);
        employee3.setInfo("Billie Eilish", "Apple Company", "QA", "A-246","F", 35, 55);
        employee4.setInfo("Adam Levine", "Apple Company", "Developer", "A-135", "M", 25, 75);
        employee5.setInfo("Kazim","Amazon","QA","T123","Male",40,40);

    }



}
