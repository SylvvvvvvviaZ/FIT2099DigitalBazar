public class Computer {
    String manufacture;


    //a constructor
    public Computer(String manufacture) {
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
