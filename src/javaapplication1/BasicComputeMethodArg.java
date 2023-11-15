/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Karbu
 */



public class BasicComputeMethodArg {
    
    public static void main(String[] args){
    
               
        System.out.println("Sum: " + add(10, 2));
        System.out.println("Difference: " + subtract(10, 2));
        //System.out.println("Product: " + multiply(num1, num2));
        //System.out.println("Quotient: " + divide(num1, num2));
    
    }
    
     public static double add(int a, int b) {
        return a + b;
    }
     
    public static double subtract(int a, int b) {
        return a - b;
    }
    
}
