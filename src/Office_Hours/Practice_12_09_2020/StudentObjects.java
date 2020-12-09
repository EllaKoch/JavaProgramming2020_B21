package Office_Hours.Practice_12_09_2020;




public class StudentObjects {
    public static void main(String[] args) {

       CybertekStudents student1 = new CybertekStudents();
       student1.setInfo("Elvira", 29, 'F');
       //student1.schoolName = "MIT";
        CybertekStudents.schoolName = "MIT"; // preferred way
        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents();
        student2.setInfo("Ella", 30, 'F');
        System.out.println(student2);




    }
}
