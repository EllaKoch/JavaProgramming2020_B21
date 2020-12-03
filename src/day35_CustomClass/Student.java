package day35_CustomClass;

/*
Create teh following custom classes:

    1. Student:
            Attributes:
                    name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
                sleep
                ...

 */
public class Student {

    public String name;
    public int age;
    public char gender;
    public String ID;


    public void setInfo(String studentName, int studentAge, char studentGender, String studentId){
        name = studentName;
        age = studentAge;
        gender = studentGender;
        ID = studentId;
    }

    public void getInfo(){
        System.out.println("Student name: " + name+", Age: " +age+", Gender: " + gender
        + ", ID: " + ID);
    }

    public void study(int classStartTime, int classEndTime){
        System.out.println("Classes start at: " +classStartTime);
        System.out.println("Classes end at: " + classEndTime );

    }

    public void sleep(String bedTime){
        System.out.println("Curfew: " + bedTime);
    }

}



