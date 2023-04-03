package main.models.purchases;
import main.utils.PurchaseType;
import main.utils.Utils;

/**
 * The Purchase class represents a purchase made by a customer for a device.

 * It is an abstract class, so it cannot be instantiated directly, but instead serves as a base class

 * for the InStorePurchase and OnlinePurchase classes.

 * @author Xiaowen Zhou

 * @version 1.0

 * @see Purchase
 */
public abstract class Purchase {
    private int purchaseID;
    private int customerID;
    private int deviceID;
    private String date;
    private PurchaseType purchaseType;

    /**
     * The constructor for the Purchase class.
     * @param customerID The unique identifier for the customer who made the purchase.
     * @param deviceID The unique identifier for the device that was purchased.
     * @param date The date on which the purchase was made, in the format YYYYMMDD.
     * @param purchaseType The type of purchase (in-store or online).
     */
    public Purchase(int customerID, int deviceID, String date, PurchaseType purchaseType) {
        this.purchaseID = Utils.nextID(100, 1000); // generate a 3-digit purchase ID
        this.customerID = customerID;
        this.deviceID = deviceID;
        this.date = date;
        this.purchaseType = purchaseType;
    } //The constructor for the Purchase class already includes exception handling for the setters, so it does not need to be updated.

    /**
     * Getter for the purchase ID.
     * @return The unique identifier for the purchase.
     */
    public int getPurchaseID() {
        return purchaseID;
    }

    /**
     * Getter for the customer ID.
     * @return The unique identifier for the customer who made the purchase.
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Getter for the device ID.
     * @return The unique identifier for the device that was purchased.
     */
    public int getDeviceID() {
        return deviceID;
    }

    /**
     * Getter for the purchase date.
     * @return The date on which the purchase was made, in the format (dd/mm/yy).
     */
    public String getDate() {
        return date;
    }

    /**
     * Getter for the purchase type.
     * @return The type of purchase (in-store or online).
     */
    public PurchaseType getPurchaseType() {
        return purchaseType;
    }

    /**
     * Setter for the purchase date.
     * @param aDate The date on which the purchase was made, in the format (dd/mm/yy).
     * @return True if the date was successfully set, false otherwise.
     */
    public boolean setDate(String aDate) {
        boolean isValid = false;
        if(aDate.length() == 8) {
            isValid = true;
            date = aDate;
        }
        return (isValid);
    }

}

