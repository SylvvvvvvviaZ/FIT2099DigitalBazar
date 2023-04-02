package main.models.devices;

import main.utils.Utils;

import java.util.InputMismatchException;

public class Computer extends Device {
    private String manufacture;

//    public Computer(String name, String description, String manufacture) {
//        super(name, description);
//        this.manufacture = manufacture;
//    }

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


    public String getManufacture() {
        return manufacture;
    }

//    public void setManufacture(String manufacture) {
//        this.manufacture = manufacture;
//    }

    public boolean setManufacture(String aManufacture) {
        boolean isValid=false;
        if(aManufacture.length()>=3 && aManufacture.length()<=15){
            isValid=true;
            manufacture = aManufacture;
        }
        return (isValid);
    }


    @Override
    public int generateId() {
        return Utils.nextID(100000, 9999999);
    }
}