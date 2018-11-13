/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractpractice;

/**
 *
 * @author s523353
 */
public class AbstractPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cannot create object of type A because it is abstract
        A ob = new A ();
        B ob1 = new B();
        ob1.whoAmI();
    }
    
}
