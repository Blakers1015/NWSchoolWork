/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classespractice2;

/**
 *
 * @author s523353
 */
public class ClassesPractice2 {
    private int age;     // instance variable
    private static String name;      // class variable, shared memory by all objects
    private static void print()      // static = belongs to class
    {
        System.out.print("In static method");
    }
public void display()           //nonstatic = belongs to object
{
    System.out.print("In non-static method");
    print();        //can access static from non-static
    read();         //can access non-static from non-static
    ClassesPractice2 obj2 = new ClassesPractice2();
    obj2.read();
    System.out.println("Age: " + age);
    System.out.println("Name: " + name);
    
            
}
public void read()
{
    System.out.println("In non-static read method");
}
   
    public static void main(String[] args) {
        // display();       //non-static cannot access static 
        ClassesPractice2 obj1 = new ClassesPractice2();
        obj1.display();
        print();
        ClassesPractice2.print();
        //System.out.println("Age: " + age);        //Static method cannot access instance variable without 
        ClassesPractice2 obj3 = new ClassesPractice2();
        System.out.println("Age: " + obj3.age);
        System.out.print("Name: " + name);
        System.out.println("Name: " + ClassesPractice2.name);
        
    }
    
}
