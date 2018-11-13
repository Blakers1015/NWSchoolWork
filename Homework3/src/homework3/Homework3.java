/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;
import java.util.Scanner;
/**
 *
 * @author s523353
 */
public class Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner option = new Scanner (System.in);
        menu();
        System.out.print("Enter your choice: ");
        int selection = option.nextInt();
        while (selection != 4)
        {
            System.out.print("Enter a distance in meters: ");
        Scanner input = new Scanner (System.in);
        int meters = input.nextInt();
        if (meters > 0)
        {
        if (selection == 1)
            showKm(meters);
        else if (selection == 2)
          System.out.println(meters + " meters is " + convertToInches(meters) + " inches");
        else if (selection == 3)
            System.out.println(meters + " meters is " + showFeet(meters) + " feet");
        else if (selection == 4)
            System.out.println("Thank you. Bye!");
        }
        else
            System.out.println("Error");
        System.out.print("Enter your choice: ");
        selection = option.nextInt();
        }
        System.out.println("Thank you. Bye!");
        Scanner player1 = new Scanner (System.in);
        System.out.print("Enter player 1's cards: ");
        String input1 = player1.nextLine();
        Scanner player2 = new Scanner (System.in);
        System.out.print("Enter player 2's cards: ");
        String input2 = player2.nextLine();
        for (int i = 0; i < input1.length(); i++)
        {
            if (input1.charAt(i) == input2.charAt(i)){
                System.out.println(input1.charAt(i) + " against " + 
                        input2.charAt(i) + ", tie");}
            if (input1.charAt(i) > input2.charAt(i)){
                System.out.println(input1.charAt(i) + " against " + 
                        input2.charAt(i)+ "\tPlayer1 is the winner");}
            if (input1.charAt(i) < input2.charAt(i)){
                System.out.println(input1.charAt(i) + " against " + 
                        input2.charAt(i) + "\tPlayer2 is the winner");}
        }
    }
    public static void menu()
    {
        System.out.println("1. Convert to Kilometers\n2. Convert to inches\n3. "
        + "Convert to feet\n4. Quit the program");
    }
    public static void showKm(int meters)
    {
        double kilometers = meters * 0.001;
        System.out.println(meters + " meters is " + kilometers + " kilometers");
    }
    public static double convertToInches(int meters)
    {
        double inches = meters * 39.37;
        return inches;
     }
    public static double showFeet(int meters)
    {
        double feet = meters * 3.281;
        return feet;
    }
    }
    
    
           
    

