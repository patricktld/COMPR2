/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RandomNumberFactorialwoutmethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of random numbers to generate: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            
            System.out.println("The Factorial of " + i + "is " + factorial);
            //System.out.println("Factorial: " + factorial);
           // System.out.println();
        }

        //scanner.close();
    }
}
