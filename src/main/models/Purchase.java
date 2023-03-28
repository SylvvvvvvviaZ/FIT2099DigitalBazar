package main.models;
import main.utils.PurchaseType;
import main.utils.Utils;

public abstract class Purchase {
    private int purchaseID;
    private int customerID;
    private int deviceID;
    private String date;
    private PurchaseType purchaseType;

    public Purchase(int customerID, int deviceID, String date, PurchaseType purchaseType) {
        this.purchaseID = Utils.nextID(100, 1000); // generate a 3-digit purchase ID
        this.customerID = customerID;
        this.deviceID = deviceID;
        this.date = date;
        this.purchaseType = purchaseType;
    }

    public int getPurchaseID() {
        return purchaseID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public String getDate() {
        return date;
    }

    public PurchaseType getPurchaseType() {
        return purchaseType;
    }

    //public abstract String getPurchaseDetails();


}

