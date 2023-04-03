package main.models.devices;

import main.controllers.IData;
import main.utils.Utils;

import java.util.InputMismatchException;

/**
 * Computer class represents a computer device in the store.

 * @author Xiaowen Zhou

 * @version 1.0

 * @see Device
 */
public class Computer extends Device {
    private String manufacture;

    /**
     * Constructor for the Computer class.
     * @param name The name of the computer device.
     * @param description The description of the computer device.
     * @param manufacture The manufacture of the computer device.
     * @throws Exception if name, description or manufacture details are invalid.
     */
    public Computer(String name, String description, String manufacture) throws Exception {
        try {
            if(setName(name) && setDescription(description) && setManufacture(manufacture)){
                // do something
            } else {
                throw new Exception("Incorrect computer's details");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for computer's details. Please enter a valid input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid number.");
        }
    }

    /**
     * Gets the manufacture of the computer device.
     * @return The manufacture of the computer device.
     */
    public String getManufacture() {
        return manufacture;
    }

    /**
     * Sets the manufacture of the computer device.
     * @param aManufacture The manufacture to set.
     * @return true if the manufacture is valid and successfully set, false otherwise.
     */
    public boolean setManufacture(String aManufacture) {
        boolean isValid=false;
        if(aManufacture.length()>=3 && aManufacture.length()<=15){
            isValid=true;
            manufacture = aManufacture;
        }
        return (isValid);
    }

    /**
     * Generates a unique id for the computer device.
     * @return The unique id generated for the computer device.
     */
    @Override
    public int generateId() {
        return Utils.nextID(100000, 9999999);
    }
}