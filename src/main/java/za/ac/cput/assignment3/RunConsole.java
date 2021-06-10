/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3;

/**
 *
 * @author Siphiwe Edson Chauque 219084777
 */
public class RunConsole {
    public static void main(String[] args) {
        RunProject RunProject = new RunProject();
        RunProject.readFromSerFile();
        RunProject.sortCustomersList();
        RunProject.formatDob();
        RunProject.printCustomers();
        RunProject.sortSuppliersList();
        RunProject.printSuppliers();
    }
}
