/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures.hw.pkg1;

/**
 *
 * @author S523353
 */
public class DataStructuresHw1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] M = new int [3][4];
        M [0][0] = 2;
        M [0][1] = 5;
        M [0][2] = 4;
        M [0][3] = 7;
        M [1][0] = 3;
        M [1][1] = 1;
        M [1][2] = 2;
        M [1][3] = 9;
        M [2][0] = 4;
        M [2][1] = 6;
        M [2][2] = 3;
        M [2][3]= 0;
//        for(int i =0; i<M.length; i++){
//            for(int j=0; j<M[i].length; i++){
//                System.out.println(M[j][i]);
//            }
//        }
        int[] array = colSum(M);
        
        for(int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
        
        
    
    }
    public static int [] colSum(int [][] M)
    {
                int [] array = new int [3];
        for (int i = 0; i < M.length; i++)
        {
            int Sum = 0;
            for (int j = 0; j < M[i].length; j++ )
            {
                Sum = Sum + M[i][j];
            }
            array[i] = Sum;
        }
        return array;
    }
}
