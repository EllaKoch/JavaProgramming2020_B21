package library;

import day43_Inheritance.personTask.Employee;

public class BA extends Employee {

    public static void main(String[] args) {

        System.out.println(BA.publicVariable);


        System.out.println(BA.protectedVariable);
      //  System.out.println(BA.defaultVariable); default can't be reached outside package


    }
}
class A{
    public static void main(String[] args) {

        System.out.println(Employee.publicVariable);
        //System.out.println(Employee.protectedVariable);A is not a subclass, that's y can't call protected
       // System.out.println(Employee.defaultVariable); outside package cane NEVER REACH


    }
}