public class Printer extends Device{
    int ppm;

    //a constructor
    public Printer(int ppm, String name, String description) {
        super(name,description);
        this.ppm = ppm;
    }

    //a getter
    public int getPpm() {
        return ppm;
    }

    //a setter
    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    //"toString" methods
    @Override
    public String toString() {
        return "Printer{" +
                "ppm=" + ppm +
                '}';
    }



}
