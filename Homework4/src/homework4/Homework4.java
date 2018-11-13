/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author s523353
 */
public class Homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of sign (Max 100)");
        int numOfSigns = input.nextInt();
        char [] arrayOfSigns = generateSigns(numOfSigns);
        System.out.println("");
        System.out.println("The way out is: ");
        char [] pathToExit = robotCS2 (arrayOfSigns);
        boolean [][] matOne = new boolean [5][5];
        boolean [][] matTwo = new boolean [5][5];
        boolean [][] matThree = new boolean [5][5];
        matOne = genBooleanMat ();
        matTwo = genBooleanMat ();
        matThree = andLogicMat(matOne, matTwo);
        for (int i = 0; i < 5; i++)
        {
            System.out.println("");
            for (int k = 0; k < 5; k++)
            {
                System.out.print(matOne[i][k] + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; i++)
        {
             System.out.println();
             for(int k=0;k<5;k++)
             {
              System.out.print(matTwo[i][k]+ " ");
             }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i =0;i<5;i++)
        {
             System.out.println();
             for(int k=0;k<5;k++)
             {
                 System.out.print(matThree[i][k]+ " ");
             }
        }
      }
    public static char [] generateSigns (int number)
    {
        Random rand = new Random();
        char [] arrayOfSigns = new char [number];
        for (int i = 0; i < number; i++)
        {
            int random = rand.nextInt(5);
            switch (random)
            {
                case 0:
                    arrayOfSigns[i] = 'L';
                    break;
                case 1:
                    arrayOfSigns[i] = 'R';
                    break;
                case 2:
                    arrayOfSigns[i] = 'S';
                    break;
                case 3:
                    arrayOfSigns[i] = 'A';
                    break;
                case 4:
                    arrayOfSigns[i] = 'D';
                    break;
            }
            System.out.print(arrayOfSigns[i] + " ");
        }
        return arrayOfSigns;
    }
    public static char [] robotCS2 (char[] number)
    {
        char [] pathToExit = new char [number.length];
        for (int i = 0; i < number.length; i++)
        {
            if(number [i] == 'L')
                pathToExit[i] = 'R';
            else if (number [i] == 'R')
                pathToExit [i] = 'L';
            else if (number [i] == 'S')
                pathToExit [i] = 'S';
            else if (number [i] == 'D')
                pathToExit [i] = 'A';
            else if (number [i] == 'A')
                pathToExit [i] = 'D';
            System.out.print(pathToExit[i] + " ");
        }
        return pathToExit;
     }
    public static boolean [][] genBooleanMat()
    {
        boolean [][] generalMat = new boolean [5][5];
        for (int i = 0; i < 5; i++)
        {
        for (int k = 0; k < 5; k++)
        {
            generalMat[i][k] = Math.random() < .5; 
        }
        }
        return generalMat;
    }
    public static boolean [][] andLogicMat (boolean [][] matOne, boolean [][] matTwo)
    {
        boolean [][] z = new boolean [5][5];
        for(int i =0;i<5;i++)
        {
            for(int k=0;k<5;k++)
            {
                z[i][k]= (matOne[i][k]==true)&&(matTwo[i][k]==true);
            }
        }
        return z;
    }
}
