/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dpracticeagain;
import java.util.*;
/**
 *
 * @author s523353
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean [][] boolArr = new boolean [2][2];
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = input.nextInt();
        int [][] intArr = new int [2][3]; 
        for (int row = 0; row < 2; row++)
        {
            System.out.println("");
            for (int col = 0; col < 2; col++)
            {
               System.out.print(boolArr[row][col] + " "); 
            }
        }
        System.out.println(boolArr[0][0]);
    }
  public static int [][] swap(int[][] array)  
  {
      
  }
}
