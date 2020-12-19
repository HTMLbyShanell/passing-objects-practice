/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_practiceobjects;

/**
 *
 * @author Shanell A. Spann
 * IT-DEV 117 - Intro to OOP
 * Assignment # 5
 * Due: 10/10/2019
 */
public class Spann_PracticeObjects {

    /**
     * @param args the command line arguments
     */
    static int Number1;
    static int Number2;
    
    public static void main(String[] args) 
    {
        Admin GetReady = new Admin();
        GetReady.Intro();
               
        MathFun Calc1 = new MathFun();
        Calc1.setNumber1(5);
        MathFun Calc2 = new MathFun();
        Calc2.setNumber2(10);
        
        Number1 = Calc1.getNumber1();
        System.out.println("The first # is" + " " + Number1);
        Number2 = Calc2.getNumber2();
        System.out.println("The second # is" + " " + Number2);
        
          
        MathFun Calc = new MathFun();
        System.out.println("The product of the numbers = " + Calc.multiplyThem());
        System.out.println("The sum of the numbers = " +  Calc.addThem());
        
        GetReady.Goodbye();
        
    }
    
}
