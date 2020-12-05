package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/*
1. create class named MyCybertekSchool
            create an array of Students that contains 10 objects,
            1. to print the students who has gpa of 3 or greater
            2. to print the students who has gpa between 2 to 3
            3. create two ArrayLists: femaleStudents, maleStudents
                        do not use loop

 */
public class MyCybertekSchool {
    public static void main(String[] args) {

        MyStudent student1 = new MyStudent();
        MyStudent student2 = new MyStudent();
        MyStudent student3 = new MyStudent();
        MyStudent student4 = new MyStudent();
        MyStudent student5 = new MyStudent();
        MyStudent student6 = new MyStudent();
        MyStudent student7 = new MyStudent();
        MyStudent student8 = new MyStudent();
        MyStudent student9 = new MyStudent();
        MyStudent student10 = new MyStudent();

        MyStudent[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};

        student1.setInfo("Elvira", 'F', LocalDate.of(1991, 04, 02), "A1234", 4.00);
        student2.setInfo("Miray", 'F', LocalDate.of(1994, 07, 02), "B1234", 3.8);
        student3.setInfo("Kate", 'F', LocalDate.of(1994, 12, 12), "C1234", 2.9);
        student4.setInfo("Aliya", 'F', LocalDate.of(1988, 07, 9), "D123", 3.6);
        student5.setInfo("Marwan", 'M', LocalDate.of(1990, 12, 5), "S9234", 4.00);
        student6.setInfo("Agalar", 'M', LocalDate.of(1998, 11, 10), "H8534", 2.97);
        student7.setInfo("Ayder", 'M', LocalDate.of(1993, 7, 8), "K8734", 2.50);
        student8.setInfo("Jildiz", 'F', LocalDate.of(1995, 6, 25), "Z2334", 2.67);
        student9.setInfo("Ana", 'F', LocalDate.of(1997, 9, 14), "K9994", 3.47);
        student10.setInfo("Sunnat", 'M', LocalDate.of(1985, 4, 19), "Z7554", 2.79);

        ArrayList<MyStudent> batch = new ArrayList<>(Arrays.asList(students));


        double highestGPA = batch.get(0).gpa;

        for (MyStudent each : batch){
            double eachGPA = each.gpa;
            highestGPA = Math.max(eachGPA, highestGPA);
        }
        System.out.println("highestGPA = " + highestGPA);

        // System.out.println("Students with GPA higher than 3.00: ");
//        for (MyStudent each : students) {
//            if (each.gpa >= 3) {
//                System.out.println(each);
//            }
//        }

        double lowestGPA = batch.get(0).gpa;
        for (MyStudent each : batch){
            double eachGPA = each.gpa;
            lowestGPA = Math.min(eachGPA, lowestGPA);
        }
        System.out.println("lowestGPA = " + lowestGPA);

        //System.out.println("Students with GPA between 2-3: ");
//        for (MyStudent each : students) {
//            if (each.gpa >= 2 && each.gpa <= 3) {
//                System.out.println(each);
//            }
//        }



        // create two arrayList : male, female
        ArrayList<MyStudent> female = new ArrayList<>();
        ArrayList<MyStudent> male = new ArrayList<>();

        female.addAll(Arrays.asList(students));
        male.addAll(Arrays.asList(students));

        female.removeIf(p -> p.gender == 'M');
        male.removeIf(p -> p.gender != 'M');
        //male.removeIf(p -> p.gender == 'F'); or this


        System.out.println("female = " + female);
        System.out.println("male = " + male);

        System.out.println("Total number of male students: "+male.size());
        System.out.println("Total Number of female students: "+female.size());



        LocalDate youngest = batch.get(0).DOfB;// assume first is the youngest
        MyStudent youngestStudent = null;// default temp value for all non primitives

        LocalDate oldest = batch.get(0).DOfB;
        MyStudent oldestStudent = null;

        for (MyStudent each : batch) {
            if (each.DOfB.isAfter(youngest)) {//whichever students DOB is after the current youngest student DOB
                youngest = each.DOfB;
                youngestStudent = each;
            } else if (each.DOfB.isBefore(oldest)) {
                oldest = each.DOfB;
                oldestStudent = each;
            }
        }
        System.out.println("youngest = " + youngest);
        System.out.println("youngestStudent = " + youngestStudent);
        System.out.println("oldest = " + oldest);
        System.out.println("oldestStudent = " + oldestStudent);



    }
}
