package day04Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

/*
Task04: SalaryCalculator
    write a program that can calculate the salary after tax based on the salary and tax rate
            Ex:
                if salary = 100000
                   tax = 0.28

                   totalTax = salary * taxRate;
                   salary after tax = salary - totalTax


 */

       int salary = 150000;
       double taxRate = 0.28;
       double totalTax = salary * taxRate;
       double salaryAfterTax = salary - totalTax;
        System.out.println("Tatal tax will be: " + totalTax);
        // System.out.println(totalTax);

        System.out.println("Your salary after tax will be: ");
        System.out.println(salaryAfterTax);


    }
}
