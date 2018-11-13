/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classespractice;

/**
 *
 * @author s523353
 */
public class StudentClass {

    //this is our first created class, StudentClass
    // note: this class is in the same package as our main class
// instance variables
    public String firstName;
    private String lastName;
    public double gpa;
    // contstructor is a method to initialize the data
    // no return type - not even void

    public StudentClass(String fName, String lName, double gpa) {
        System.out.println("Fields in constructor: ");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("GPA: " + gpa);
        // iniitializing instance variables
        firstName = fName;
        lastName = lName;
        gpa = gpa;
        System.out.println("Fields in constructor: ");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("GPA: " + gpa);
    }

    public StudentClass() {
        firstName = "";
        lastName = "";
        gpa = 0.0;

    }

    // getter or accessor for GPA
    public String getGPA() {
        return firstName;
    }
public StudentClass (String fname, String 1name)
{
    
}
// setter for First Name
public void setFirstname (String fname)
{
    firstName = fName;
}
public void setLastName (String 1Name)
{
    lastName = 1Name;
}
public void getGPA(double grade)
{
    gpa = grade;
}
public void setAll ()
}
