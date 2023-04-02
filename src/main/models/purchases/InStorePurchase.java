package main.models.purchases;

import main.models.purchases.Purchase;
import main.utils.PurchaseType;

public class InStorePurchase extends Purchase {
    private String storeLocation;

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

    public String getStoreLocation() {
        return storeLocation;
    }

//    public void setStoreLocation(String storeLocation) {
//        this.storeLocation = storeLocation;
//    }

    public boolean setStoreLocation(String aStoreLocation) {
        boolean isValid=false;
        if(aStoreLocation.length()>=3 && aStoreLocation.length()<=10){
            isValid=true;
            storeLocation = aStoreLocation;
        }
        return (isValid);
    }
}
