package main.models.purchases;
import main.utils.PurchaseType;

/**
 * A class representing an online purchase.
 * @author Xiaowen Zhou

 * @version 1.0

 * @see Purchase
 */
public class OnlinePurchase extends Purchase {
    private String deliveryAddress;

    /**
     * Constructs a new OnlinePurchase object.
     * @param customerID      the ID of the customer who made the purchase
     * @param deviceID        the ID of the device purchased
     * @param date            the date of the purchase
     * @param deliveryAddress the delivery address for the online purchase
     * @throws Exception if the customer ID, device ID, date, or delivery address is invalid
     */
    public OnlinePurchase(int customerID, int deviceID, String date, String deliveryAddress) throws Exception {
        super(customerID, deviceID, date, PurchaseType.ONLINE);
        try {
            if (!setDeliveryAddress(deliveryAddress)) {
                throw new Exception("Incorrect delivery address's details");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Returns the delivery address for the online purchase.
     * @return the delivery address
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the delivery address for the online purchase.
     * @param aDeliveryAddress the delivery address to set
     * @return true if the delivery address is valid, false otherwise
     */
    public boolean setDeliveryAddress(String aDeliveryAddress) {
        boolean isValid=false;
        if(aDeliveryAddress.length()>=5 && aDeliveryAddress.length()<=20){
            isValid=true;
            deliveryAddress = aDeliveryAddress;
        }
        return (isValid);
    }
}
