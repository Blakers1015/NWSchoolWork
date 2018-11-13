/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author s523353
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int binarySearch (int [] searchArray, int searchItem){
        int first = 0; 
        int last = searchArray.length - 1;
        int mid = 0;
        boolean found = false;
        while (first <= last && ! found){
            mid = (first + last) / 2;
            if (searchArray[mid] == searchItem){
                found = true;
            }
        }
    }
    
}
