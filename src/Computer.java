public class Computer extends Device{
    String manufacture;


    //a constructor
    public Computer(String manufacture, String name, String description) {
        super(name,description);
        this.manufacture = manufacture;

    }

    //a getter
    public String getManufacture() {
        return manufacture;
    }

    //a setter
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    //"toString" methods
    @Override
    public String toString() {
        return "Computer{" +
                "manufacture='" + manufacture + '\'' +
                '}';
    }
}
