package day40_Constructor;

import java.text.DecimalFormat;

public class SalaryCalculator {

    public static int numberOfWorkingDays, numberOfWeeks;

    static {
        numberOfWorkingDays= 5;
        numberOfWeeks = 52;
    }

    public double hours, hourlyRate, stateTaxRate, federalTaxRate, salary, salaryAfterTax, totalTax;
//                                                                   8                       20
//                                                                  0.08                    0.2
    public SalaryCalculator(double hours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        if (stateTaxRate > 1)
            stateTaxRate = stateTaxRate / 100;

        if (federalTaxRate > 1)
            federalTaxRate = federalTaxRate / 100;


        this.hours = hours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        salary = hourlyRate * hours * numberOfWeeks;
        totalTax = (stateTaxRate + federalTaxRate) * salary;
        salaryAfterTax = salary - totalTax;

    }

    public String toString() {
        DecimalFormat dc = new DecimalFormat("0.00");


        return "SalaryCalculator{" +
                "hours=" + hours +
                ", hourlyRate= $" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary= $" + dc.format(salary) +
                ", salaryAfterTax=  $" + dc.format(salaryAfterTax) +
                ", totalTax= $" + dc.format(totalTax) +
                ", Number of working days:" + numberOfWorkingDays +
                ", Number of weeks: "+numberOfWeeks+
                '}';
    }




}


