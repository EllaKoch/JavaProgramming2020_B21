package day47_Abstraction.PersonTask;

public class AppleInc {
    public static void main(String[] args) {
        Tester tester = new Tester("Mini", 23, 'F',"SDET","S123", 75_000);
        Developer developer = new Developer("Emre",30,'M',"784512","gkj7", 10000);
        UberDriver driver = new UberDriver("Levent",38,'M',"986532","5gj", 80000);


        tester.work();
        tester.sleep();

        developer.sleep();
        developer.work();

        driver.work();
        driver.sleep();

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(driver);


    }
}
