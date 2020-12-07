package day38_Statics.ScrumTask;

public class Tester {

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

    public void smokeTesting(){
        System.out.println(name+ " is performing smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }


    public String toString() {
        return "Tester{" +
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
Task
        create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
        create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), coding(),  fixingBug(), toString()
        create a class called ScrumTeam
                    Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testersList = new ArrayList<>(),
                            ArrayList<Developer> devopsList = new ArrayList<>(),
                    Actions:
                            setInfo(): sets the names of: PO, BA, SM
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist
                            toString(): prints number of tester,& developers,  PO name, SM name, BA name

 */