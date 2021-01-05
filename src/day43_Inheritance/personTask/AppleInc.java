package day43_Inheritance.personTask;

public class AppleInc {// AppleInc HAS A Tester
                    // AppleInc   HAS A Developer
    public static void main(String[] args) {

        Tester tester1 = new Tester("Elvira", 29, 'F', 67, "SDET", "777");
        tester1.eat();
        tester1.sleep();
        tester1.work();
        System.out.println("Salary: "+tester1.calcSalary());
        tester1.testing();
        System.out.println(tester1);

        Developer developer1 = new Developer("Mini", 29, 'F', 67, "SDET", "777");
        developer1.eat();
        developer1.sleep();
        developer1.work();
        developer1.coding();
        System.out.println(developer1.calcSalary());
        System.out.println(developer1);


    }







}
