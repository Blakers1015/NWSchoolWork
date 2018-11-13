/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filespractice;
import java.util.Scanner;
import java.io.File;
import java.io.*;
/**
 *
 * @author s523353
 */
public class FilesPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        for (int i = 0; i< 4; i++)
        {
            System.out.println("Please enter a number: ");
            int num = input.nextInt();
            //read from keyboard and write to the screen       
        }
        //read from a file and write to the screen 
        //first, open the file for reading 
        File myFile = new File ("number.txt");
        Scanner nextInput = new Scanner(myFile);
        
        
    }
    
}
