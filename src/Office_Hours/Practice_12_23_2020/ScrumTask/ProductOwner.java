package Office_Hours.Practice_12_23_2020.ScrumTask;

public class ProductOwner extends Employee {


    public ProductOwner(String name, String ID, char gender, double salary, boolean isFullTime) {
        super(name, "Product Owner", ID, gender, salary, isFullTime);
    }


    public void acceptProduct(){
        System.out.println(jobTitle + " " + name + " has accepted the product");
    }


    public void rejectProduct(){
        System.out.println(jobTitle + " " + name + " has rejected the product");
    }


    public void writeUserStory(){
        System.out.println(jobTitle + " " + name + " is writing user story");
    }


}
