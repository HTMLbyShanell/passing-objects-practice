/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_practiceobjects;

/**
 *
 * @author Shanell A. Spann
 */
public class MathFun 
{
    private int Number1 = 5;
    private int Number2 = 10;
    private int multiplyThem;
    private int addThem;
    private int product;
    private int sum;
    
    
    public int getNumber1()
    {
        return Number1;
    }
    
    public void setNumber1(int newNumber1)
    {
        Number1 = newNumber1;
    }
    
    public int getNumber2()
    {
        return Number2;
    }
    
    public void setNumber2(int newNumber2)
    {
        Number2 = newNumber2;
    }
            
            
    public int multiplyThem( )
    {
       product = Number1 * Number2;
       return product;
    }
    
    public int addThem()
    {
        sum = Number1 + Number2;
        return sum;
    }
    
    
}
