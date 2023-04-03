package main.models.purchases;
import main.models.devices.Device;
import main.utils.PurchaseType;

/**
 * A class representing an in-store purchase.

 * @author Xiaowen Zhou

 * @version 1.0

 * @see Purchase
 */
public class InStorePurchase extends Purchase {
    private String storeLocation;

    /**
     * Constructs a new InStorePurchase object.
     * @param customerID    the ID of the customer who made the purchase
     * @param deviceID      the ID of the device purchased
     * @param date          the date of the purchase
     * @param storeLocation the location of the store where the purchase was made
     * @throws Exception if the customer ID, device ID, date, or store location is invalid
     */
    public InStorePurchase(int customerID, int deviceID, String date, String storeLocation) throws Exception {
        super(customerID, deviceID, date, PurchaseType.IN_STORE);
        try {
            if (!setStoreLocation(storeLocation)) {
                throw new Exception("Incorrect store location's details");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Returns the location of the store where the purchase was made.
     * @return the store location
     */
    public String getStoreLocation() {
        return storeLocation;
    }

    /**
     * Sets the location of the store where the purchase was made.
     * @param aStoreLocation the store location to set
     * @return true if the store location is valid, false otherwise
     */
    public boolean setStoreLocation(String aStoreLocation) {
        boolean isValid=false;
        if(aStoreLocation.length()>=3 && aStoreLocation.length()<=10){
            isValid=true;
            storeLocation = aStoreLocation;
        }
        return (isValid);
    }
}
