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
public class ClassesPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // This is our main class
        // calling constructor in Studentclass to create an object
        StudentClass std1 = new StudentClass("Hannah", "Protzman", 4.0);
        StudentClass std2 = new StudentClass("Sagar", "Ghimere", 1.5);
        System.out.println("In main: ");
        System.out.println("GPA: " + std1.getGPA());
    }
    
}
