/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author s523353
 */
public class Lion implements Animals {
    @Override
    public void eat()
    {
        System.out.println("Eat method in Lion");
    }
    @Override
    public void hunt()
    {
        System.out.println("Hunt method in Lion");
    }
    public String huntingTime()
    {
        return "The lion hunts at 3 am";
    }
    public static void main(String[] args)
    {
//        Animals a1 = new Animals();     //Animals is abstract; cannot be instantiated
        Lion lion1 = new Lion();
        lion1.eat();
        lion1.hunt();
        System.out.println(lion1.huntingTime());
    }
    
    
}
