/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constover;

/**
 *
 * @author Abhishek
 */
public class ConstOver {
    
    ConstOver()
    {
        // Default Constructor
        System.out.println("I am default constructor.");
    }
    
    ConstOver(int a)
    {
        // Parameeterized Constructor
        System.out.println("I am parameterized constructor."+ "The parameter received is 2. "+a);
    }

    public static void main(String[] args) {
        
        ConstOver obj=new ConstOver();
        ConstOver obj1=new ConstOver(2);
    }
    
}
