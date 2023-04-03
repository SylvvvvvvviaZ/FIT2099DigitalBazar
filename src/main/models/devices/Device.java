package main.models.devices;

/**
 * The Device class represents a generic device in the store.

 * It contains basic properties such as name, description, and ID.

 * This is an abstract class and cannot be instantiated directly.

 * Subclasses should implement the generateId() method to generate a unique ID for each instance.

 * @author Xiaowen Zhou

 * @version 1.0

 * @see Device
 */
public abstract class Device {
    private String name;
    private String description;
    private int id;

    /**
     * Constructs a Device object with the given name and description.
     * @param name the name of the device
     * @param description the description of the device
     * @throws Exception if name or description are invalid
     */
    public Device(String name, String description) throws Exception {
        try {
            if(setName(name) && setDescription(description)) {
                this.id = generateId();
            } else {
                throw new Exception("Incorrect Device's details");
            }
        } catch (Exception e) {
            throw new Exception("Error creating device: " + e.getMessage());
        }
    }

    /**
     * Empty constructor used by subclasses.
     */
    protected Device() {
    }

    /**
     * Returns the name of the device.
     * @return the name of the device
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the device.
     * @param aName the new name for the device
     * @return true if the name is valid and has been set, false otherwise
     */
    public boolean setName(String aName) {
        boolean isValid=false;
        if(aName.length()>=3 && aName.length()<=15){
            isValid=true;
            name = aName;
        }
        return (isValid);
    }

    /**
     * Returns the description of the device.
     * @return the description of the device
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the device.
     * @param aDescription the new description for the device
     * @return true if the description is valid and has been set, false otherwise
     */
    public boolean setDescription(String aDescription) {
        boolean isValid=false;
        if(aDescription.length()>=5 && aDescription.length()<=20){
            isValid=true;
            description = aDescription;
        }
        return (isValid);
    }

    /**
     * Returns the ID of the device.
     * @return the ID of the device
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the device.
     * @param id the new ID for the device
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Generates a new ID for the device.
     * @return a unique ID for the device
     */
    public abstract int generateId(); //add an abstract method called "generateId" that returns an integer representing a new ID
}


