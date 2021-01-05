package Office_Hours.Practice_12_23_2020.ScrumTask;

public class Employee {

    public String name, jobTitle, ID;
    public char gender;
    public double salary;
    public boolean isFullTime;


    public Employee(String name, String jobTitle, String ID, char gender, double salary, boolean isFullTime) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.gender = gender;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Employee{" +
                ", jobTitle='" + jobTitle + '\'' +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
