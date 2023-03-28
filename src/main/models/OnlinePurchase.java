package main.models;

import main.utils.PurchaseType;

public class OnlinePurchase extends Purchase{
    private String deliveryAddress;

    public OnlinePurchase(int customerID, int deviceID, String date, String deliveryAddress) {
        super(customerID, deviceID, date, PurchaseType.ONLINE);
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    @Override
    public String getPurchaseDetails() {
        return "Online purchase of device " + getDeviceID() +
                " by customer " + getCustomerID() +
                " on " + getDate() +
                " with delivery address " + deliveryAddress;
    }
}
