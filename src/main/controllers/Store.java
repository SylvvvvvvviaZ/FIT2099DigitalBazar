package main.controllers;

import main.models.devices.Computer;
import main.models.devices.Printer;
import main.models.purchases.InStorePurchase;
import main.models.purchases.OnlinePurchase;
import main.models.purchases.Purchase;
import main.utils.IMenuManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Store implements IData {
    //convert the access modifier of all the constructors from public to private
    private ArrayList<Computer> computers;
    private ArrayList<Printer> printers;
    private IMenuManager menuManager;
    private PurchaseManager purchaseManager;

    private static Store instance = null;

    public Store(IMenuManager menuManager, PurchaseManager purchaseManager) {
        this.computers = new ArrayList<Computer>();
        this.printers = new ArrayList<Printer>();
        this.menuManager = menuManager;
        this.purchaseManager = purchaseManager;
    }

    //use the static factory method getInstance() obtain an instance of 'Store'
    public static Store getInstance(IMenuManager menuManager, PurchaseManager purchaseManager) {
        if (instance == null) {
            instance = new Store(menuManager, purchaseManager);
        }
        return instance;
    }

    public void createComputers() throws Exception {
        String name, description, manufacture;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Device Name:");
        name = scanner.nextLine();
        System.out.print("Enter Device Description:");
        description = scanner.nextLine();
        System.out.print("Enter Computer Manufacture: ");
        manufacture = scanner.nextLine();
        Computer aComputer = new Computer(name, description, manufacture);
        aComputer.setId(aComputer.generateId());
        computers.add(aComputer);
    }

    public void createPrinters() throws Exception {
        int ppm;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Device Name:");
        String name = scanner.nextLine();
        System.out.print("Enter Device Description:");
        String description = scanner.nextLine();
        System.out.print("Enter Pages per Minute (PPM): ");
        ppm = scanner.nextInt();
        Printer aPrinter = new Printer(name, description, ppm);
        aPrinter.setId(aPrinter.generateId());
        printers.add(aPrinter);
    }

    public void printComputers() {
        System.out.println("Computers:\n");
        String formatString = "| %-5s | %-20s | %-20s | %-15s |%n";
        System.out.format(formatString, "ID", "Name", "Description", "Manufacture");
        System.out.format("%s%n", "-".repeat(71));
        for (Computer c : computers) {
            System.out.format(formatString, c.getId(), c.getName(), c.getDescription(), c.getManufacture());
        }
    }

    public void printPrinters() {
        System.out.println("Printers:\n");
        String leftAlignFormat = "| %-10d | %-20s | %-20s | %-10d |%n";
        String leftAlignFormatHeader = "| %-10s | %-20s | %-20s | %-10s |%n";
        System.out.format(leftAlignFormatHeader, "ID", "Name", "Description", "PPM");

        String border = String.format("+%s+\n", "-".repeat(71));
        System.out.print(border);

        for (Printer p : printers) {
            System.out.format(leftAlignFormat, p.getId(), p.getName(), p.getDescription(), p.getPpm());
        }
    }

//    public void runBazar() {
//        initStore(3, 2);
//        menuManager.menuItem();
//    }

    // This implementation iterates through the list of devices in the store, checks if the given id matches the id of any of the devices.
    public boolean isDeviceAvailable(int id) {  // To implement the IData interface in the Store class.
        for (Computer computer: this.computers) {
            if (computer.getId() == id) {
                return true;
            }
        }
        for (Printer printer: this.printers) {
            if (printer.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void createPurchase() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Device ID: ");
        int deviceID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Date (dd/mm/yyyy): ");
        String date = scanner.nextLine();
        //scanner.nextLine();

        System.out.print("Enter Type (0 online) or (1 in-store): ");
        int purchaseTypeInt = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter delivery address: ");
        String deliveryAddress = scanner.nextLine();

        Purchase data = null;

        if (purchaseTypeInt == 1) {
            data = new InStorePurchase(customerID, deviceID, date, deliveryAddress);
        }
        else{
            data = new OnlinePurchase(customerID, deviceID, date, deliveryAddress);
        }

        purchaseManager.makePurchase(this, data);
    }


}