package main.models.purchases;
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
    } //The constructor for the Purchase class already includes exception handling for the setters, so it does not need to be updated.

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

//    public void setDate(String date) {
//        this.date = date;
//    }

    public boolean setDate(String aDate) {
        boolean isValid = false;
        if(aDate.length() == 8) {
            isValid = true;
            date = aDate;
        }
        return (isValid);
    }

}

