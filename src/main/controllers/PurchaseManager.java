package main.controllers;

import main.models.Purchase;

import java.util.ArrayList;

public class PurchaseManager {
    private ArrayList<Purchase> purchases;

    public PurchaseManager() {
        this.purchases = new ArrayList<Purchase>();
    }

    public void makePurchase(IData devices, Purchase data) {
        if (devices.isDeviceAvailable(data.getDeviceID())) {
            this.purchases.add(data);
        }
    }

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
