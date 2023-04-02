package main.models.devices;

public abstract class Device {  //make it an abstract class.
    private String name;
    private String description;
    private int id;

//    public Device(String name, String description) {
//        this.name = name;
//        this.description = description;
//        this.id = generateId();
//    }

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

    protected Device() {
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public boolean setName(String aName) {
        boolean isValid=false;
        if(aName.length()>=3 && aName.length()<=15){
            isValid=true;
            name = aName;
        }
        return (isValid);
    }

    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public boolean setDescription(String aDescription) {
        boolean isValid=false;
        if(aDescription.length()>=5 && aDescription.length()<=20){
            isValid=true;
            description = aDescription;
        }
        return (isValid);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract int generateId(); //add an abstract method called "generateId" that returns an integer representing a new ID
}


