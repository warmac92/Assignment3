/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisdemo;

/**
 *
 * @author Abhishek
 */
public class ThisDemo {

    int a,b;

    public void setData(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
    public void showData()
    {
        System.out.println("Values of a and b when this is used: "+a+" "+b);
        
    }
    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo();
        obj.setData(2, 3);
        obj.showData();
       
    }
    
}
