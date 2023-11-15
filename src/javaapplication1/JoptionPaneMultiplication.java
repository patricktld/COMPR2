/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

public class JoptionPaneMultiplication {
    public static void main(String[] args) {
        // Step 1: Get user input for the number of rows and columns
        String rowInput = JOptionPane.showInputDialog("Enter the number of rows:");
        String columnInput = JOptionPane.showInputDialog("Enter the number of columns:");

        try {
            // Step 2: Parse the input as integers
            int numRows = Integer.parseInt(rowInput);
            int numColumns = Integer.parseInt(columnInput);

            // Step 3: Generate and display the custom multiplication table
            String table = generateCustomMultiplicationTable(numRows, numColumns);
            JOptionPane.showMessageDialog(null, "Custom Multiplication Table " + numRows + "x" + numColumns + ":\n" + table);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String generateCustomMultiplicationTable(int numRows, int numColumns) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numColumns; j++) {
                int result = i * j;
                table.append(i).append(" x ").append(j).append(" = ").append(result).append("\t");
            }
            table.append("\n"); // Move to the next row
        }
        return table.toString();
    }
}
