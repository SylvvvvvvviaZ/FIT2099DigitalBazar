public class Printer {
    int ppm;

    //a constructor
    public Printer(int ppm) {
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
