package main.models.devices;

import main.utils.Utils;

/**
 * A class representing a Printer device.

 * @author Xiaowen Zhou

 * @version 1.0

 * @see Device
 */
public class Printer extends Device {
    private int ppm;

    /**
     * Constructs a new Printer object.
     * @param name        the name of the printer
     * @param description a description of the printer
     * @param ppm         the pages per minute the printer is capable of printing
     * @throws Exception if the name, description or ppm value is invalid
     */
    public Printer(String name, String description, int ppm) throws Exception {
        super(name, description);
        try {
            if (!setPpm(ppm)) {
                throw new Exception("Incorrect Printer's details");
            }
        } catch (NumberFormatException e) {
            throw new Exception("Invalid input for ppm: " + e.getMessage());
        }
    }

    /**
     * Returns the pages per minute the printer is capable of printing.
     * @return the pages per minute
     */
    public int getPpm() {

        return ppm;
    }

    /**
     * Sets the pages per minute the printer is capable of printing.
     * @param aPpm the pages per minute to set
     * @return true if the pages per minute value is valid, false otherwise
     */
    public boolean setPpm(int aPpm) {
        boolean isValid = false;
        if (aPpm >= 1 && aPpm <= 50) {
            isValid = true;
            ppm = aPpm;
        }
        return (isValid);
    }

    /**
     * Generates a unique identifier for the printer.
     * @return a unique identifier for the printer
     */
    @Override
    public int generateId() {
        return Utils.nextID(100, 999);
    }
}