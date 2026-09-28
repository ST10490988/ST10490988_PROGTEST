/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iconsoles;

/**
 *
 * @author Student
 */
public abstract class Consoles implements IConsoles {

    // Variables to store
    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor 
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Methods from the interface
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Subclasses must write their own report
    public abstract void printReport();
}
