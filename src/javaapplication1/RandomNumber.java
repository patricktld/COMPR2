/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
public class RandomNumber {

    public static void main(String args[]) {
//the next line will give you random number from 1 to 10
        int number = 1 + (int) (10 * Math.random());
//the next line will display the value of the random number
        System.out.println("Random number is: " + number);
    }

}
