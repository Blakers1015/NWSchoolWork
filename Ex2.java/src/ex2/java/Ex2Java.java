/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.java;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author s523353
 */
public class Ex2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("How many Random Numbers to be generated (enter an even number): ");
        int numGen = input.nextInt();
        
        Scanner range = new Scanner (System.in);        
        System.out.println("Enter the range from 0 to 50: ");
        int rangeMax = range.nextInt();
       
        System.out.println("The first " + numGen + " Random Numbers between 0 and "
                + rangeMax + " are: ");
        Random number = new Random();
        int oddNum = 0;
        int evenNum = 0;
        int maxNum = 0;
        int minNum = 50;
        double evenAve;
        double oddAve;
        int evenAdd = 0;
        int oddAdd = 0;
        
        for (int num = 0; num < numGen; num++)
        {
            int numberOut = number.nextInt(rangeMax);
            System.out.print(numberOut + " ");
            if (numberOut % 2 == 0)
                evenNum++;
                
            else
                oddNum++;
            
            if (numberOut > maxNum)
                maxNum = numberOut;
            if (numberOut < minNum)
                minNum = numberOut;
           
            if (num % 2 == 0)
                evenAdd = numberOut + evenAdd;
            if (num % 2 != 0)
                oddAdd = numberOut + oddAdd;
                
                
                        
            
        }
        evenAve = evenAdd / evenNum;
        oddAve = oddAdd / oddNum;
        System.out.println("\nThere are " + evenNum + " Even Numbers");
        System.out.println("There are " + oddNum + " Odd Numbers");
        System.out.println("The maximum number generated is: " + maxNum);
        System.out.println("The minimum number generated is: " + minNum);
        System.out.println("The average of all evenly indexed numbers is: " + evenAve );
        System.out.println("The average of all oddly indexed numbers is: " + oddAve );
                
        
        
        
            
            
        
                
        
        
        
                
    }
    
}
