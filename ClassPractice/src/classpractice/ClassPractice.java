/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpractice;

/**
 *
 * @author s523353
 */
public class ClassPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "Hannah";
        String str2 = "hannah"; 
        String str3 = "Abbey";
        String str = "Zach";
        boolean x = str1.equals(str2);
        System.out.println(x);
        x = str1.equalsIgnoreCase(str2);
        System.out.println(x);
        int retInt = str3.compareTo(str4);
        if (retInt == 0)
        {
            System.out.println("Str3 comes first");
        }
        else if (retInt > 0)
                {
                    System.out.println("Str4 comes first");
                }
        else
        {
            System.out.println("Str3 comes first");
        }
                    
                
            
        
}
