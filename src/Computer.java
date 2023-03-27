public class Computer extends Device {
    private String manufacture;

    public Computer(String name, String description, String manufacture) {
        super(name, description);
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public int generateId() {
        return Utils.nextID(100000, 9999999);
    }
}