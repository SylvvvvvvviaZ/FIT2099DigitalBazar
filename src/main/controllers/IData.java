package main.controllers;

/**
 * The IData interface provides methods for checking the availability of devices in the inventory.

 * Implementing classes must implement the 'isDeviceAvailable' method to perform the check.

 * @author Xiaowen Zhou

 * @version 1.0

 * @see Store
 */
public interface IData {
    /**
     Checks the availability of a device in the inventory.
     @param id The ID of the device to check.
     @return True if the device is available, false otherwise.
     */
    boolean isDeviceAvailable(int id);
}

