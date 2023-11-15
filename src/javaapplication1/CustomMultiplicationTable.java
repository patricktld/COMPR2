/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

public class CustomMultiplicationTable {

    public static void main(String[] args) {
        // Step 3: Create dialog boxes to take user input for the range
        String startInput = JOptionPane.showInputDialog("Enter the starting number for the multiplication table:");
        String endInput = JOptionPane.showInputDialog("Enter the ending number for the multiplication table:");

        try {
            // Parse the input as integers
            int startNumber = Integer.parseInt(startInput);
            int endNumber = Integer.parseInt(endInput);

            if (startNumber <= endNumber) {
                // Step 4: Generate and display the multiplication table
                String table = generateCustomMultiplicationTable(startNumber, endNumber);
                JOptionPane.showMessageDialog(null, "Custom Multiplication Table from " + startNumber + " to " + endNumber + ":\n" + table);
            } else {
                JOptionPane.showMessageDialog(null, "Starting number should be less than or equal to the ending number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String generateCustomMultiplicationTable(int start, int end) {
        StringBuilder table = new StringBuilder();
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                table.append(i).append(" x ").append(j).append(" = ").append(result).append("\n");
            }
            table.append("\n"); // Add a blank line between tables
        }
        return table.toString();
    }
}
