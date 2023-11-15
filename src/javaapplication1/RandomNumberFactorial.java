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
public class RandomNumberFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Random number: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            long factorial = calculateFactorial(i);
            System.out.println("The Factorial of " + i + "is " + factorial);

        }

        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
