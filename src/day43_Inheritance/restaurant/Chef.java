package day43_Inheritance.restaurant;

import day43_Inheritance.personTask.Employee;

public class Chef extends Employee {// Chef Is an Employee, Chef Is A Person

    // inherits:
    // name age, gender, hourlyRate, jobTitle, ID
    // work(), setInfo, setInfo, toString, eat, sleep, calcSalary



    public Chef(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void makeOrder(){
        System.out.println(jobTitle +" " +  name+ " is making order");
    }


    public void cooking(){
        System.out.println(jobTitle+" " + name + " is cooking");
    }













}
