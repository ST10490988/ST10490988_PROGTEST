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

public class iconsole {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Let the user select a console device type
        System.out.println("Select a console device type:");
        System.out.println("1. PlayStation");
        System.out.println("2. Xbox");
        System.out.println("3. Nintendo Switch");
        System.out.print("Enter choice (1-3): ");
        int choice = input.nextInt();
        input.nextLine(); // clear the leftover newline

        String consoleType;
        switch (choice) {
            case 1:
                consoleType = "PlayStation";
                break;
            case 2:
                consoleType = "Xbox";
                break;
            case 3:
                consoleType = "Nintendo Switch";
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        // Store name and total sales
        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = input.nextInt();

        // Instantiate ConsoleSales and print the report
        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);
        report.printReport();

        input.close();
    }
}





