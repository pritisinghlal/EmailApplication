package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {



        //How many users we want to add
        System.out.println("Enter the number of students you want to add");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];




        //Create n number of new students
        for (int n= 0; n< numberOfStudents;n++){
            students [n] = new Student();
            students[n].enroll();
            students[n].payTuition();

        }
        for (int n = 0; n< numberOfStudents; n++){
            System.out.println(students[n].toString());
        }
        /*System.out.println(students[0].toString());
        System.out.println(students[1].toString());
        System.out.println(students[2].toString())*/;
    }

}
