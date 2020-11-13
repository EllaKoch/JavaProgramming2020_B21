package day05ArithmeticOperators;

public class EmployeeInfo_Concatination {
    public static void main(String[] args) {
        /*
        Apply concatination consept in print statement
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

        String firstName = "Yasin";
        String lastName = "Seyhan";
        String fullName = firstName + " "+ lastName;
        char gender = 'M';
        int age = 30;
        String companyName = "Bank Of America";
        String jobTitle = "Software Developer";
        double salary = 150000;
        boolean isFulltime = true;
        boolean isMarried = false;



        System.out.println("Empoyee's full name is " + fullName);
        System.out.println(fullName + "'s gender is " + gender);
        System.out.println(fullName + "'s age is " + age + " years old");
        System.out.println(fullName + " works at "  + companyName);
        System.out.println(fullName + "'s Job title is: " + jobTitle);
        System.out.println(fullName +"'s salary is: $" + salary);
        System.out.println(fullName + " is a Full Time Employee: " + isFulltime);
        System.out.println(fullName + " is married: " + isMarried);







    }
}
/*

 */