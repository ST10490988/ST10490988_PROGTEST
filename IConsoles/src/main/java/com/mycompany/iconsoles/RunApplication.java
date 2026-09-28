/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iconsoles;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the console device type: ");
        String consoleType = scanner.nextLine();

        System.out.print("Enter the store name: ");
        String store = scanner.nextLine();

        System.out.print("Enter total sales: ");
        int totalSales = scanner.nextInt();

        System.out.println(); // Blank line for output formatting

        // Instantiate ConsoleSales object
        ConsoleSales salesReport = new ConsoleSales(consoleType, store, totalSales);

        // Display the report
        salesReport.printReport();

        scanner.close();
    }
}





