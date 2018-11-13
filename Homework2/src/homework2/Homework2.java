/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;
import java.util.Random;
import java.util.Scanner;
        

/**
 *
 * @author s523353
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Part 1 of homework
        Scanner city = new Scanner (System.in);
        System.out.println("Enter the city: ");
        String cityName = city.nextLine();
        int areaCodeM = 660;
        int areaCodeB = 816;
        int areaCodeC = 417;
        int areaCode = 0;
        Random intGenerator = new Random ();
        int numMid = intGenerator.nextInt(751);
        int numEnd = intGenerator.nextInt(5555) + 1234;
        if (cityName.equalsIgnoreCase("Maryville") || cityName.equalsIgnoreCase("Chillicothe")){
            areaCode = areaCodeM;
            String phoneNum = areaCode + "-" + numMid + "-" + numEnd;
            System.out.println("Telephone number: " + phoneNum);
        }
        else if (cityName.equalsIgnoreCase("Belton") || cityName.equalsIgnoreCase("Saint Joseph")){
            areaCode = areaCodeB;
            String phoneNum = areaCode + "-" + numMid + "-" + numEnd;
            System.out.println("Telephone number: " + phoneNum);
        }
        else if (cityName.equalsIgnoreCase("Columbia") || cityName.equalsIgnoreCase("Jefferson City")){
            areaCode = areaCodeC;
            String phoneNum = areaCode + "-" + numMid + "-" + numEnd;
            System.out.println("Telephone number: " + phoneNum);
        }
        else{
            System.out.println("Cannot generate a number for this town.");}
        
        // Part 2 of homework
        Random numGen = new Random ();
        String operator = "";
        Random randNum = new Random();
        int randGen = randNum.nextInt(5);
        int num1 = numGen.nextInt(226)-50;
        System.out.println("First number: " + num1);
        int num2 = numGen.nextInt(226)-50;
        System.out.println("Second number: " + num2);
        int calc = 0;
        switch (randGen)
                {
                    case 0:
                        operator = "+";
                        calc = num1 + num2;
                        break;
                    case 1:
                        operator = "-";
                        calc = num1 - num2;
                        break;
                    case 2:
                        operator = "*";
                        calc = num1 * num2;
                        break;
                    case 3:
                        operator = "/";
                        calc = num1 / num2;
                        break;
                    case 4:
                        operator = "%";
                        calc = num1 % num2;
                        break;
               }
        System.out.println("Operator: " + operator);
        System.out.println(num1 + operator + num2 + " = " + calc);
        
        
        
       
                
        
                
        
        
    }
    
}
