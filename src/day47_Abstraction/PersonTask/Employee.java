package day47_Abstraction.PersonTask;

public  abstract class Employee extends Person {

    public String jobTitle, ID;
    public double salary;

    public Employee(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    public abstract void work();
    // public abstract void sleep();


    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
