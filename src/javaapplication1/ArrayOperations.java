/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class ArrayOperations {

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {10, 23, 5, 17, 8, 12};

        // Print the original array
        System.out.println("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // Newline

        // Calculate and print the sum
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum of Elements: " + sum);

        // Find and print the maximum value
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maximum Value: " + max);

        // Find and print the minimum value
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Minimum Value: " + min);

        // Find and print the average value
        double average = (double) sum / arr.length;
        System.out.println("Average Value: " + average);

        // Create and print a new array with even elements
        System.out.println("Even Elements: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Newline

        // Create and print a new array with odd elements
        System.out.println("Odd Elements: ");
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Newline

        // Sort and print in ascending order
        java.util.Arrays.sort(arr);
        System.out.println("Sorted in Ascending Order: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // Newline

        // Sort and print in descending order
        System.out.println("Sorted in Descending Order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
