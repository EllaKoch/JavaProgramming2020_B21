package day43_Inheritance.personTask;

public class Tester extends Employee{

    // inherits:
    // name age, gender, hourlyRate, jobTitle, ID
    // work(), setInfo, toString, eat, sleep,  setInfo, calcSalary


    public Tester(String name, int age, char gender, double hourlyRate, String jobTitle, String ID) {
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void testing(){
        System.out.println(jobTitle + " "+name + " is testing");
    }



}
/*
Tester extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), testing(),...
 */