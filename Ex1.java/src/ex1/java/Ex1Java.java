/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.java;
import java.util.Random;
/**
 *
 * @author s523353
 */
public class Ex1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;
        Random number = new Random();
        System.out.println("The first 20 Random Numbers between 0 and 50 are: ");

        while (num < 20)
        {
            
            int numberOut = number.nextInt(51);
            num ++;
            
            
            System.out.print(numberOut + " ");
            
            
        
                
        }
        
    }
    
}
