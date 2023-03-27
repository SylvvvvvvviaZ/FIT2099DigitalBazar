package main.controllers;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Computer> computers;
    private ArrayList<Printer> printers;

    public Store() {
        this.computers = new ArrayList<Computer>();
        this.printers = new ArrayList<Printer>();
    }

    public void initStore(int numOfComputers, int numOfPrinters) {
        computers = new ArrayList<>(numOfComputers);
        printers = new ArrayList<>(numOfPrinters);
    }

    public void createComputers() {
        String name, description, manufacture;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter main.models.Device Name:");
        name = scanner.nextLine();
        System.out.print("Enter main.models.Device Description:");
        description = scanner.nextLine();
        System.out.print("Enter main.models.Computer Manufacture: ");
        manufacture = scanner.nextLine();
        Computer aComputer = new Computer(name, description, manufacture);
        aComputer.setId(aComputer.generateId());
        computers.add(aComputer);
    }

    public void createPrinters() {
        int ppm;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter main.models.Device Name:");
        String name = scanner.nextLine();
        System.out.print("Enter main.models.Device Description:");
        String description = scanner.nextLine();
        System.out.print("Enter Pages per Minute (PPM): ");
        ppm = scanner.nextInt();
        Printer aPrinter = new Printer(name, description, ppm);
        aPrinter.setId(aPrinter.generateId());
        printers.add(aPrinter);
        //scanner.nextLine(); // consume the remaining newline character
    }

    public void printComputers() {
        System.out.println("Computers:\n");
        System.out.format("%-10s%-20s%-20s%s\n", "ID", "Name", "Description", "Manufacture");
        for (Computer c : computers) {
            System.out.format("%-10d%-20s%-20s%s\n", c.getId(), c.getName(), c.getDescription(), c.getManufacture());
        }
    }

    public void printPrinters() {
        System.out.println("Printers:\n");
        System.out.format("%-10s%-20s%-20s%s\n", "ID", "Name", "Description", "PPM");
        for (Printer p : printers) {
            System.out.format("%-10d%-20s%-20s%d\n", p.getId(), p.getName(), p.getDescription(), p.getPpm());
        }
    }

    public void runBazar() {
        initStore(3, 2);
        createComputers();
        createPrinters();
        printComputers();
        printPrinters();
    }
}
