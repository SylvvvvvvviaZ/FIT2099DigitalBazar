package main.models.devices;

import main.utils.Utils;

public class Printer extends Device {
    private int ppm;

//    public Printer(String name, String description, int ppm) {
//        super(name, description);
//        this.ppm = ppm;
//    }

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

    public int getPpm() {

        return ppm;
    }

//    public void setPpm(int ppm) {
//
//        this.ppm = ppm;
//    }

    public boolean setPpm(int aPpm) {
        boolean isValid = false;
        if (aPpm >= 1 && aPpm <= 50) {
            isValid = true;
            ppm = aPpm;
        }
        return (isValid);
    }

    @Override
    public int generateId() {
        return Utils.nextID(100, 999);
    }
}