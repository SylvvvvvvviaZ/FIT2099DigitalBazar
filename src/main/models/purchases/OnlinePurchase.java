package main.models.purchases;

import main.models.purchases.Purchase;
import main.utils.PurchaseType;

public class OnlinePurchase extends Purchase {
    private String deliveryAddress;

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

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

//    public void setDeliveryAddress(String deliveryAddress) {
//        this.deliveryAddress = deliveryAddress;
//    }

    public boolean setDeliveryAddress(String aDeliveryAddress) {
        boolean isValid=false;
        if(aDeliveryAddress.length()>=5 && aDeliveryAddress.length()<=20){
            isValid=true;
            deliveryAddress = aDeliveryAddress;
        }
        return (isValid);
    }
}
