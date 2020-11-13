package day28_MultiDimentionalArray;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String[] employeeNames = {"Ella", "Omid", "Ana", "Milan", "Vida"};
        //                          0       1       2       3       4
        int[] employeeSalary = {130000, 130000, 110000, 100000, 120000};
        //                         0     1       2         3     4


        int max = employeeSalary[0];
        String nameOfMaxSalaryEmployee = "";

        int min = employeeSalary[0];
        String nameOfMinSalaryEmployee = "";


        for(int i = 0; i <= employeeNames.length-1; i++){
            System.out.println(employeeNames[i] +" : $" + employeeSalary[i]);
//          since both arrays have the same corresponding index number they can be concatenated

            if(employeeSalary[i]>=max){
                max= employeeSalary[i];
                nameOfMaxSalaryEmployee = employeeNames[i];

            }

            if(employeeSalary[i]<= min){
                min= employeeSalary[i];
                nameOfMinSalaryEmployee = employeeNames[i];
            }


        }
        System.out.println(nameOfMaxSalaryEmployee + " has the maximum salary: $" + max);
        System.out.println(nameOfMinSalaryEmployee + " has the minimum salary: $" + min);














    }
}
