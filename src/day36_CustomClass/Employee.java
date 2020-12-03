package day36_CustomClass;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    // instance variable needed to store diff data to the objects

    public String name, jobTitle, ID, companyName;
    public double salary;
    public LocalDate hireDate;
    public char gender;


    // instance method, here we need to initialize the instance variables above
    public void setInfo(String name, char gender, String jobTitle, String companyName, String ID, double salary, LocalDate hireDate) {// local variable name should be diff
        this.name = name;// this. refers to object instances
        this.gender = gender;// instance = local(local is whatever is given in parameters)
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.ID = ID;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void getInfo(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.println(String.format("Name: " + name + ", Gender: " + gender + ", ID: " + ID +
                ", Company Name: " + companyName +
                ", Job Title: " + jobTitle + ", Hired: " + hireDate.format(df) + ", Salary: $" + decimal.format(salary)));
    }

    public void working(){
        System.out.println(name + " is working.");
    }

    public void meeting(){
        System.out.println(name +" is in a meeting");
    }



}
