/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodover;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class MethodOver {

 
    private void meth(float a,float b)
    {
        System.out.println("Sum of a and b: "+(a+b));
    }
    
    private void meth(float a,float b,char c)
    {
        System.out.println("Difference of a and b: "+(a-b));
    }
    
    private void meth(char c, float a, float b)
    {
        System.out.println("Multiplication of a and b: "+(a*b));
    }
    
    private void meth(float a, char c, float b)
    {
        System.out.println("Multiplication of a and b: "+(a/b));
    }
    
    public static void main(String[] args) {
        MethodOver obj = new MethodOver();
        System.out.println("Enter values of a and b:");
        float a,b;
        Scanner sn = new Scanner(System.in);
        a=sn.nextFloat();
        b=sn.nextFloat();
        obj.meth(a,b);
        obj.meth(a, b,'c');
        obj.meth('c',a, b);
        obj.meth(a, b,'c');
        
    }
    
}
