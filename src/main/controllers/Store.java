package main.controllers;

import main.models.Computer;
import main.models.Device;
import main.models.Printer;
import main.models.Purchase;
import main.utils.MenuManager;
import main.utils.PurchaseType;

import java.util.ArrayList;
import java.util.Scanner;

public class Store implements IData {
    private ArrayList<Computer> computers;
    private ArrayList<Printer> printers;
    private ArrayList<Device> devices;
    private MenuManager menuManager;
    private PurchaseManager purchaseManager;

    public Store(MenuManager menuManager, PurchaseManager purchaseManager) {
        this.computers = new ArrayList<Computer>();
        this.printers = new ArrayList<Printer>();
        this.devices = new ArrayList<Device>();
        this.menuManager = menuManager;
        this.purchaseManager = purchaseManager;
    }

    public void initStore(int numOfComputers, int numOfPrinters) {
        computers = new ArrayList<>(numOfComputers);
        printers = new ArrayList<>(numOfPrinters);
    }

    public void createComputers() {
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
        devices.add(aComputer);
    }

    public void createPrinters() {
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
        devices.add(aPrinter);
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

        String border = String.format("+%s+\n", "-".repeat(64));
        System.out.print(border);

        for (Printer p : printers) {
            System.out.format(leftAlignFormat, p.getId(), p.getName(), p.getDescription(), p.getPpm());
        }
    }

    public void runBazar() {
        initStore(3, 2);
        menuManager.menuItem();
    }

    // This implementation iterates through the list of devices in the store, checks if the given id matches the id of any of the devices.
    public boolean isDeviceAvailable(int id) {  // To implement the IData interface in the Store class.
        for (Device d : this.devices) {
            if (d.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public Purchase createPurchase() {
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

        PurchaseType purchaseType = PurchaseType.ONLINE;
        if (purchaseTypeInt == 1) {
            purchaseType = PurchaseType.IN_STORE;
        }

        System.out.print("Enter delivery address: ");
        String deliveryAddress = scanner.nextLine();

        Purchase purchase = new Purchase(customerID, deviceID, date, purchaseType) {
            @Override
            public String getPurchaseDetails() {
                return null;
            }
        };
        purchaseManager.makePurchase(this, purchase);
        return purchase;
    }


}