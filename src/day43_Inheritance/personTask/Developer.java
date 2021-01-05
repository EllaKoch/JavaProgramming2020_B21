package day43_Inheritance.personTask;

public class Developer extends Employee{
// Developer is a Person. Developer is An Employee. Is a relationship

    // inherits:
    // name age, gender, hourlyRate, jobTitle, ID
    // work(), setInfo, toString, eat, sleep,  setInfo, calcSalary


    public Developer( String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void coding(){
        System.out.println(jobTitle+" " + name+" is coding");
    }





}
/*
Developer extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), code()...

 */