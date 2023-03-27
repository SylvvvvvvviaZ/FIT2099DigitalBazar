package main.models;

import main.utils.Utils;

public class Printer extends Device {
    private int ppm;

    public Printer(String name, String description, int ppm) {
        super(name, description);
        this.ppm = ppm;
    }

    public int getPpm() {

        return ppm;
    }

    public void setPpm(int ppm) {

        this.ppm = ppm;
    }

    @Override
    public int generateId() {
        return Utils.nextID(100, 999);
    }
}