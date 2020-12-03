package day35_CustomClass;

public class StudentInfo {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("Elvira Koch", 29, 'F', "345678");
        student1.getInfo();

        student1.study(10,5);
        student1.sleep("11PM");


    }
}
