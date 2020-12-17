package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MySalary {
    public static void main(String[] args) {
        SalaryCalculator salary1 = new SalaryCalculator(40, 65, 9, 0.2);

        //System.out.println(salary1);

        SalaryCalculator salary2 = new SalaryCalculator(40, 75, 0, 0.2);

        SalaryCalculator salary3 = new SalaryCalculator(35, 65, 8, 21);

        SalaryCalculator salary4 = new SalaryCalculator(40, 45, 7, 0.2);

        SalaryCalculator salary5 = new SalaryCalculator(40, 50, 9, 22);

        System.out.println("====================================");
        // print max salary after tax

        ArrayList<SalaryCalculator> list = new ArrayList<>(Arrays.asList(salary1, salary2, salary3, salary4, salary5));
        //System.out.println(list);

        // double maxSalary = list.indexOf(0);
        double maxSalary = list.get(0).salaryAfterTax;
        double minSalary = list.get(0).salaryAfterTax;

        double maxTotalTax = list.get(0).totalTax;
        double minTotalTax = list.get(0).totalTax;

        for (SalaryCalculator eachSalary : list) {
            /*if (eachSalary.salaryAfterTax > maxSalary) {
                maxSalary = eachSalary.salaryAfterTax;
                }
                */
            maxSalary = Math.max(eachSalary.salaryAfterTax, maxSalary);
            minSalary = Math.min(eachSalary.salaryAfterTax, minSalary);

            maxTotalTax = Math.max(eachSalary.totalTax, maxTotalTax);
            minTotalTax = Math.min(eachSalary.totalTax, minTotalTax);


        }

        System.out.println("The maximum salary is: $" + maxSalary);
        System.out.println("The minimum salary is: $" + minSalary);

        System.out.println("====================================");

        System.out.println("minTotalTax = " + minTotalTax);
        System.out.println("maxTotalTax = " + maxTotalTax);








    }
}
