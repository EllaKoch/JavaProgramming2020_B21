package day37_CustomClass;

import java.time.LocalDate;

/*
Create teh following custom classes:

    1. MyStudent:
            Attributes:
                    name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
                sleep
                ...

 */
public class MyStudent {

    public String name, ID;
    public LocalDate DOfB;
    public int age;
    public char gender;
    public double gpa;

    public void setInfo(String name, char gender, LocalDate DOfB, String ID, double gpa){
        this.name  = name;
        this.gender =gender;
        this.DOfB = DOfB;
        age = LocalDate.now().getYear() - DOfB.getYear();
        this.ID = ID;
        this.gpa = gpa;
    }


    public String toString() {
        return "MyStudent " +
                "name: " + name +
                ", ID: " + ID +
                ", DOB: " + DOfB +
                ", age: " + age +
                ", gender: " + gender +
                ", gpa: " + gpa ;
    }
}
