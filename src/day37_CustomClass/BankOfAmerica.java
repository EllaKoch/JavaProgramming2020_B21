package day37_CustomClass;

public class BankOfAmerica {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setInfo("Elvira", "Bank of America", "QA", "234", "F", 45, 55 );

        System.out.println(employee1);

        double totaltax = employee1.calculateTax(0.05, 0.22);

        System.out.println("totaltax = " + totaltax);

        System.out.println("Salary after tax: " + (employee1.salary - totaltax));


    }
}
