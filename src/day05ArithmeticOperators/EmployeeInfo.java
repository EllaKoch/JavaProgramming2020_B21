package day05ArithmeticOperators;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "Yasin";
        String lastName = "Seyhan";
        String fullName = firstName + " "+ lastName;
        char gender = 'M';
        int age = 30;
        String companyName = "Bank Of America";
        String jobTitle = "Sdet";
        double salary = 150000;
        boolean isFulltime = true;
        boolean isMarried = false;

        System.out.print("Employee' full name is: ");
        System.out.println(fullName);
        System.out.print("Gender is: ");
        System.out.println(gender);

        System.out.print(fullName);
        System.out.print("' age is: ");
        System.out.print(age);
        System.out.println(" years old");

        System.out.print(fullName);
        System.out.print(" works at: ");
        System.out.println(companyName);

        System.out.print(fullName);
        System.out.print("' job title is: ");
        System.out.println(jobTitle);

        System.out.print(fullName);
        System.out.print("' salary is: $");
        System.out.println(salary);

        System.out.print(fullName);
        System.out.print("' is full time employee: ");
        System.out.println(isFulltime);

        System.out.print(fullName);
        System.out.print("' is married: ");
        System.out.println(isMarried);





    }
}
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