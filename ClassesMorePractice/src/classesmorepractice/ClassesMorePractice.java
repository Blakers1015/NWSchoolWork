/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesmorepractice;

/**
 *
 * @author s523353
 */
public class ClassesMorePractice {
    private static int age = 22;
    private String name = "Hannah";
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ClassesMorePractice obj1 = new ClassesMorePractice();
       obj1.age = 16;
       obj1.name = "Hannah";
       System.out.println("Age: " + age);
       System.out.println("Name: " + obj1.name);
       ClassesMorePractice obj2 = new ClassesMorePractice();
       age = 18;
       obj2.name = "Protzman";
       System.out.println("Age: " + age);
       System.out.println("Name: " + obj1.name);
       
    }
    
}
