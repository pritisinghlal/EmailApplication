package StudentDatabaseApp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;


    //Constructor : prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n 2 - Sophmore\n 3 - Junior\n 4 - senior \n Enter student class level");
        this.gradYear = in.nextLine();
        setStudentID();
       // System.out.println(firstName + " " + lastName + " " + gradYear + " " + studentID);
    }


    //Generate an ID
    private void setStudentID() {
        //Grade level + ID
        id++;
        this.studentID = gradYear + "" + id;
    }

    //Enroll in course
    public void enroll() {
        //get inside a loop, user hits 0;
        do {
            System.out.println("Enter courses to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else
            {
                break;
            }
           // System.out.println("Enrolled in: " + courses);
           // System.out.println("Tuition Balance: " + tuitionBalance);

        } while (1 != 0) ;

        }


    //View balance
    public void viewBalance() {
        System.out.println("your balance is: $"+ tuitionBalance);
}
    //Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment");
        Scanner in = new Scanner(System.in);
        int payment;
        payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }

    //Show status
    public String toString(){
        return "Name: " + firstName +" "+ lastName+
                "\n Grade level: " +gradYear+
                "\n Student ID: " +studentID+
                "\n Courses Enrolled: "+ courses+
                "\n Balance: $"+ tuitionBalance;
    }

}