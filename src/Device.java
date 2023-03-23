public abstract class Device {  //make it an abstract class.
    private String name;
    private String description;
    private int id;

    public Device(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = generateId(); //add a new integer attribute named "id"
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract int generateId(); //add an abstract method called "generateId" that returns an integer representing a new ID
}


