/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayinput;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class ArrayInput {

    private int[] a = new int[5];  //Array a of int type


    public void array()
    {   //Method for inserting elements to array a
         Scanner sn= new Scanner(System.in);
	 System.out.println("Please enter 5 elements for array:");
	 for (int i=0;i<5;i++)
	    {
	      a[i] = sn.nextInt();
	     }
        
    }
    
    private void print()
    {  //Method for displaying elements inserted in array a
        System.out.println("The 5 elements are:");
        for (int i=0;i<5;i++)
        {
            System.out.print(a[i] +" ");
        }
        
    }

    public static void main(String[] args) {
         ArrayInput obj = new ArrayInput();
         obj.array();
         obj.print();
    }


    
}
