package day04Variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
       Warmup tasks:
  1. create a class named EmployeeInfo
 declare the following variables:
 firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
 write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false

        */
        String  firstName = "John";
        String lastName = "Daniel";
        char gender = 'M';
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;

        System.out.println("Employee' full name is: ");// + firstName +' '+ lastName);
        System.out.println(firstName+' '+lastName);
        System.out.println("Gender is: ");
        System.out.println(gender);
        System.out.println("Age is: ");
        System.out.println(age);
        System.out.println("Works at: ");
        System.out.println(companyName);
        System.out.println("Job title is: ");
        System.out.println(jobTitle);
        System.out.println("Salary is: ");
        System.out.println(salary);
        System.out.println("Employment is Full-Time: ");
        System.out.println(isFullTime);
        System.out.println("Married: ");
        System.out.println(isMarried);

        /*
        John Daniel' gender is: M
        John Daniel' age is: 35 years old
        John Daniel works at: CapitalOne
        John Daniel' Job title is: SDET
        John Daniel' salary is 120000.5 $
        John Daniel is full time employee: true
        John Daniel is married: false
        */




    }
}
