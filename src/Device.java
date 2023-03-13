public class Device {
    public String name;

    public String description;

    //two-parameter constructor
    public Device(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //toString method
    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }





}
