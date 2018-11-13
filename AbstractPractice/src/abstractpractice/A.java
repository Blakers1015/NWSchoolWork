
package abstractpractice;

public abstract class A {
    //Class A is our abstract class
    //cannot instantiate objects
    // can have one or more abstract methods
    //or can have concrete methods
    
    
    public abstract void whoAmI();  //this is an abstract method, only declaration
    //implementation will be done in B class (subclass)
    
    public void display()
    {
        System.out.println("Concrete method in class A");
    }
   
    
}
