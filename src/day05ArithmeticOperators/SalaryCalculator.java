package day05ArithmeticOperators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 150000;
        double stateTaxRate = 0.09;
        double federalTaxRate = 0.25 ;
        double stateTax = stateTaxRate * salary;
        double federalTax = federalTaxRate * salary;
        double totalTax = stateTax + federalTax ;
        double salaryAfterTax = salary - totalTax;

       // double salary = 100000, stateTax = 0.08, federalTax = 0.21, StateTax = stateTaxRate*salary, federalTax = federalTaxRate*salary, totalTax = stateTax+federalTax,
               // salaryAfterTax = salary - totalTax;
        
        System.out.println("Salary is: $" + salary);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("Total Tax is: $" + totalTax);
        System.out.println("Salary after tax is: $" + salaryAfterTax);


        /*
        System.out.println("Salary is: " + salary + "\n"+ "State Tax is: " + stateTax + "\n"+ "Federal tax is: " + federalTax + "\n" + "Total tax is: " + totalTax + "\n" + "Salary after tax is: " + salaryAfterTax);
        */
    }
}

/*

Task: SalaryCalculator

    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax

 */