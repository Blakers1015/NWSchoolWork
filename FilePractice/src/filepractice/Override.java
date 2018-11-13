/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

/**
 *
 * @author s523353
 */
public class Override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person("Hannah", "Protzman", 919449693);
        System.out.println("First Name: " + p1.getFname());
        System.out.println("Last Name: " + p1.getLname());
        System.out.println("ID: " + p1.getId());
        System.out.println(p1); //compiler codes implicitly built-in toString method
        //we can explicitly overrride by creating our own toString method
        // we can write the textual represenation of the object
        //hash codes used to narrow search
        //based on the concept of compartment
        
        
        
    }
    
}
