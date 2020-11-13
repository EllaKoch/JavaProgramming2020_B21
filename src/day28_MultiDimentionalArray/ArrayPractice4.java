package day28_MultiDimentionalArray;

public class ArrayPractice4 {
    public static void main(String[] args) {
        String[] employeeNames = {"Ella", "Omid", "Ana", "Milan", "Vida", "Aliya","Rinat", "Pedro"};
        //                          0       1       2       3       4
        int[] employeeSalary = {125000, 120000, 110000, 100000, 120000, 125000, 125000, 100000};
        //                         0     1       2         3     4          5       6       7

        int max = employeeSalary[0];
        for(int each : employeeSalary){
            if(each>max){
                max=each;
            }
        }// this loop was to find max salary
        System.out.println(max);

        for(int i = 0; i <=employeeNames.length-1; i++ ){// this loop is to compare employee salary with salary
            if(max == employeeSalary[i]){// and print their names if employees salary is matching with max
                System.out.println(employeeNames[i]);
            }
        }




    }
}
