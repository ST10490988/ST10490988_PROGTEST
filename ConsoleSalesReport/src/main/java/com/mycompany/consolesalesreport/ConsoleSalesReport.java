/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesalesreport;

/**
 *
 * @author Student
 */
public class ConsoleSalesReport {

    public static void main(String[] args) {

        // Single-dimensional arrays
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PlayStation", "Xbox", "Switch"};

        // Two-dimensional array: rows = cities, columns = consoles
        // (replace with the figures from your brief)
        int[][] sales = {
            {120, 95, 80},    // Cape Town
            {150, 110, 105},  // Port Elizabeth
            {90, 85, 70}      // Pretoria
        };

        // Single-dimensional array to hold each city's total
        int[] cityTotals = new int[cities.length];

        // Calculate totals for each city
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < consoles.length; j++) {
                cityTotals[i] += sales[i][j];
            }
        }

        // Find the city with the most sales
        int maxIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[maxIndex]) {
                maxIndex = i;
            }
        }

        // ---------- OUTPUT ----------
        System.out.println("QUARTERLY CONSOLE REPORT");
        System.out.println("------------------------------------------------------");

        // Header row
        System.out.printf("%-18s", "");
        for (String console : consoles) {
            System.out.printf("%-14s", console);
        }
        System.out.println();

        // Sales rows
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s", cities[i].toUpperCase());
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-14d", sales[i][j]);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%d%n", cities[i].toUpperCase(), cityTotals[i]);
        }

        System.out.println("------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex].toUpperCase());
    }
}