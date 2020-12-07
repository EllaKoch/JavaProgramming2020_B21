package day38_Statics.ScrumTask;

public class Developer {

    public String name, ID, jobTitle, companyName;
    public double salary;
    public char gender;

    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding() {
        System.out.println(jobTitle + " " + name + " is coding");
    }

    public void fixingBug(){
        System.out.println(jobTitle + " " + name + " is crying");
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
/*
create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), coding(),  fixingBug(), toString()
 */