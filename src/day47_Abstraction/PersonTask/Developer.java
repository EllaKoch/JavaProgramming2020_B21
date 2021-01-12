package day47_Abstraction.PersonTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("Developer is Coding");
    }

    @Override
    public void sleep() {
        System.out.println("Developer sleeps about 8 hours");
    }
}
