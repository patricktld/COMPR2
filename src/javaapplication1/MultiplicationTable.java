/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

public class MultiplicationTable {

    public static void main(String args[]) {

        String rowInput = JOptionPane.showInputDialog("Enter rows (1-10)");
        String columnInput = JOptionPane.showInputDialog("Enter columns (1-10)");

        try {
            int row = Integer.parseInt(rowInput);
            int column = Integer.parseInt(columnInput);

            if (row > 10) {
                JOptionPane.showMessageDialog(null, "Invalid Rows", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (column > 10) {
                JOptionPane.showMessageDialog(null, "Invalid Columns", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                for (int x = 1; x <= row; x++) {
                    for (int y = 1; y <= column; y++) {
                        System.out.print(x * y + "\t");
                    }
                    System.out.println(" ");
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
