package emailApplicaion;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class EmailAccount {
    private String fname;
    private String lname;
    private String password;
    private String department;
    private int mailboxCapacity=500;
    private String alternateEmail;
    private int defaultPasswordLength=10;
    private String email;
    private String companySuffix = "company.com";

    //Constructor to receive the first and last name;
    public EmailAccount(String fname,String lname){
        this.fname = fname;//this refers to the class level variable and other name refers to the local level method
        this.lname = lname;
        System.out.println("New employee= "+this.fname +this.lname);

        //call the method asking for the department-return department name
        //askDeparment(department);
        this.department = setDeparment();
        System.out.println("Department= "+ this.department);

        //call the method returns random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password= " +this.password);

        //combine elements to generate email
        email = fname.toLowerCase()+ "." + lname.toLowerCase()+ "@" + department + companySuffix;
        System.out.println("Your email is: "+ email);
    }

    //Ask for the department
//    private String setDeparment(String department){
    private String setDeparment(){
        System.out.println("Please enter the department codes: \n 1 for Sales. \n 2 for Marketing. \n 3 for Accounting");
        Scanner sc = new Scanner(System.in);
        int deptChoice = sc.nextInt();
        if (deptChoice == 1){
            return "Sales";
        }else if(deptChoice == 2){
            return "Marketing";
        }else if (deptChoice == 3){
            return "Accounting";
        }else return "Please enter the correct department";

    }
    //Generate a random password

    private String randomPassword(int length ){
        String passwordSet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[]  password = new char[length];
        for (int i = 0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
           // System.out.println(rand);
            //System.out.println(passwordSet.charAt(rand));
           // System.out.println("jkkkkkkkkkkk");

        }
        //return password;// This return doesn't work, because you have to return an array.
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    //Set the alternate email
    public void setAlternateEmail(String altEmail)
    {
        this.alternateEmail = altEmail;
    }

    //change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail()
    {
        return alternateEmail;
    }
    public String getPassword()
    {
        return password;
    }
    public String dispayInfo(){
        return "Name= "+fname+" "+lname+
                " Company email= "+email+
                " Mailbox capacity= "+mailboxCapacity+" mb";
    }

}
