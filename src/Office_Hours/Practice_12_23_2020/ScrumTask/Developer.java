package Office_Hours.Practice_12_23_2020.ScrumTask;

public class Developer  extends Employee{





    public Developer(String name, String jobTitle, String ID, char gender, double salary, boolean isFullTime) {
        super(name, jobTitle, ID, gender, salary, isFullTime);
    }


    public void fixingBug(){
        System.out.println(jobTitle + " " + name + " fixing bug.");
    }



}
