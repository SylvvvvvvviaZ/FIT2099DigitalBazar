package main.controllers;

import main.models.purchases.Purchase;

import java.util.ArrayList;
/**

 * The PurchaseManager class manages purchases made by customers.

 * It is a singleton class that provides access to the purchase list and the ability to make a new purchase.

 * @author Xiaowen Zhou

 * @version 1.0

 * @see IData

 */
public class PurchaseManager {
    /**
     * The single instance of PurchaseManager.
     */
    private static PurchaseManager instance = null;
    /**
     * The list of purchases.
     */
    private ArrayList<Purchase> purchases;
    /**
     * Constructs a new PurchaseManager object.
     */
    public PurchaseManager() {
        this.purchases = new ArrayList<Purchase>();
    } //This constructor is already updated to throw an exception if any of the setters returns false.

    /**
     * Gets the single instance of PurchaseManager.
     * @return The single instance of PurchaseManager.
     */
    public static PurchaseManager getInstance() {
        if (instance == null) {
            instance = new PurchaseManager();
        }
        return instance;
    }

    /**
     *Makes a new purchase.
     * @param devices The device data used to verify if the device is available.
     * @param data The purchase data to be added to the list of purchases.
     */
    public void makePurchase(IData devices, Purchase data) {
        if (devices.isDeviceAvailable(data.getDeviceID())) {
            this.purchases.add(data);
        }
    }

    /**
     * Prints the list of purchases.
     */
    public void printPurchases() {
        String leftAlignFormat = "| %-5d | %-5d | %-10s | %-8s |%n";
        String leftAlignFormatHeader = "| %-5s | %-5s | %-10s | %-8s |%n";
        String header = String.format(leftAlignFormatHeader, "C-I", "D-ID", "Date", "Type");
        int headerLen = header.length() - 1; // -1 to ignore the return key
        String border = String.format("%" + headerLen + "s", " ").replace(' ', '-');

        System.out.format("%s\n", border);
        System.out.format(header);
        System.out.format("%s\n", border);

        for (Purchase p : purchases) {
            System.out.format(leftAlignFormat, p.getCustomerID(), p.getDeviceID(), p.getDate(), p.getPurchaseType());
        }

        System.out.format("%s\n", border);
    }
}
