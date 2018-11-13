/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author s523353
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        double average = 0;
        int [] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double [] arrayB = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        
        for (int i = 1; i <= arrayA.length; i++){
            System.out.print(i + " ");
            sum = sum + i;
         }
        average = (double) sum / arrayA.length;
        System.out.println("\nThe sum of array A is: " + sum);
        System.out.println("The average of array A is: " + average);
        for (int k = arrayB.length - 1; k >= 0; k--)
            System.out.print(arrayB[k] + " ");
        System.out.println(" ");
        Boolean [] flag = new Boolean[10];
        for (int k = 0; k < 10; k ++)
        {
            if (k % 2 == 0)
                flag[k] = true;
            else
                flag[k] = false;
            System.out.print(flag[k] + " ");
        }
        System.out.println(" ");
        Scanner input = new Scanner (System.in);
        char [] C = new char[8];
        for (int i = 0; i < C.length; i++)
        {
            System.out.println("Please enter an element for Array C: ");
            C[i] = input.next().charAt(0);
        }
        System.out.println(Arrays.toString(C));
        
        char first = C[0]; 
        int firstIndex = 0; 
        for(int p = 0; p < C.length; p++)
        {
            System.out.print(C[p] + " ");
            if(C[p] < first)
            {
                first = C[p]; 
                firstIndex = p; 
            }
        }
         System.out.println("");
        System.out.println("The letter that comes first in the alphabet from array C is: " + first);
        System.out.println("And its index in array C is: " + firstIndex);
        
        swap(C); 
        System.out.print("Elements after swapping are: ");
        for(int i = 0; i < C.length; i++)
        {
            System.out.print(C[i] + " ");
        }
       }
    public static void swap(char[] swapArray)
    {        
        char temp = swapArray[0];
        swapArray[0] = swapArray[7]; 
        swapArray[7] = temp;
    }   
    
}
