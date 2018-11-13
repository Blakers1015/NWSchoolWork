/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.*;
/**
 *
 * @author s523353
 */
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Part 1 of homework
        Scanner input = new Scanner (System.in);    //Prep for reading
        System.out.print("Enter the number of seconds:");       
        int seconds = input.nextInt();      //Read for input 
        int hours = seconds / 3600;
        int minutes = (seconds - (hours * 3600)) / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is equivalent to " + hours + 
                " hours, " + minutes + " minutes, " + " and " +
                remainingSeconds + " seconds.");
        
        // Part 2 of homework
        System.out.print("Enter employee's name: ");
        Scanner typeName = new Scanner (System.in);
        String name = typeName.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        Scanner inputHours = new Scanner (System.in);
        int hoursWorked = inputHours.nextInt();
        System.out.print("Enter hourly pay rate: ");
        Scanner inputPayRate = new Scanner (System.in);
        double payRate = inputPayRate.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        Scanner inputFedWith = new Scanner (System.in);
        double fedWith = inputFedWith.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        Scanner inputStateWith = new Scanner (System.in);
        double stateWith = inputStateWith.nextDouble();
        System.out.println("Employee's name: " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Pay Rate: " + "$" + payRate);
        double grossPay = payRate * hoursWorked;
        System.out.println("Gross Pay: " + "$" + grossPay);
        System.out.println("Deductions:");
        double fedWithAmount = fedWith * grossPay;
        System.out.println("\tFederal Withholding" + "(" + fedWith * 100 + "%): "
                + "$" + fedWithAmount);
        double stateWithAmount = stateWith * grossPay;
        System.out.println("\tState Withholding" + "(" + stateWith * 100 + "%): "
                + "$" + stateWithAmount);
        double totalDeduction = stateWithAmount + fedWithAmount;
        System.out.println("\tTotal Deduction: " + "$" + totalDeduction);
        double netPay = grossPay - totalDeduction;
        System.out.println("Net Pay: " + "$" + netPay);
        
        
        
        // Part 3 of homework
                String firstName;
        String lastName;
        // Get First Name
        firstName = JOptionPane.showInputDialog ("Enter your First Name");
         // Get LAST Name
        lastName = JOptionPane.showInputDialog  ("Enter your Last Name");
        //Display Message
        JOptionPane.showMessageDialog(null, "See You Next Time"+ " " +
                firstName + " " + lastName );

                
                
        
                
        
        
        
        
        
           
        
                
    }
    
}
