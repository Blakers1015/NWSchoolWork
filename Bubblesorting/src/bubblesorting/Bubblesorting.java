/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesorting;

/**
 *
 * @author s523353
 */
public class Bubblesorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] charArray = {'o', 'b', 'y', 'g', 'a', 'x'};
        System.out.println("Array before bubble sort");
        for (int i = 0; i < charArray.length; i++)
            System.out.print(charArray[i] + " ");
                        bubbleSort(charArray);                
                        System.out.println("");
                        System.out.println("Array After Bubble Sort");
                                        for(int i=0; i < charArray.length; i++)
                                            System.out.print(charArray[i] + " ");
        
    }
    public static void bubbleSort(char[] charArray )  {
            int n = charArray.length;
            char temp = 0;
            for(int i=0; i < n; i++)          
            {
                for(int j=1; j < (n-i); j++)             
                {
                                   if(charArray[j-1] > charArray[j])
                                   {
                                                        temp = charArray[j-1];
                                                        charArray[j-1] = charArray[j];
                                                        charArray[j] = temp; 
                                   }}}}}
               
            
    }
    
}
