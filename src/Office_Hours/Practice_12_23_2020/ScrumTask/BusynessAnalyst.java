package Office_Hours.Practice_12_23_2020.ScrumTask;

public class BusynessAnalyst extends Employee {


    public BusynessAnalyst(String name, String ID, char gender, double salary, boolean isFullTime) {
        super(name, "Busyness Analyst", ID, gender, salary, isFullTime);
    }


    public void talkToClient() {
        System.out.println(jobTitle + " " + name + " is talking to client");
    }


}
