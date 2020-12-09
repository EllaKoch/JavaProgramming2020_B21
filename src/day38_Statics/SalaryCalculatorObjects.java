package day38_Statics;

public class SalaryCalculatorObjects {
    public static void main(String[] args) {
        SalaryCalculator obj1 = new SalaryCalculator();
        obj1.setInfo(55, 40, 8, 22);
        System.out.println(obj1);



        SalaryCalculator obj2 = new SalaryCalculator();
        obj2.setInfo(55, 40, 8, 22);

        System.out.println(obj1==obj2);


        // ==

        System.out.println( obj1.equals(obj2)  );


    }
}
