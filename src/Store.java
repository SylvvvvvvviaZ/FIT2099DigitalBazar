import java.util.ArrayList; // import the ArrayList class
public class Store {
    private Computer[] computers;
    private Printer[] printers;

    public Store() {

    }

    public void initStore(int numComputers, int numPrinters) {
        this.computers = new Computer[numComputers];
        this.printers = new Printer[numPrinters];
    }

    public void createComputers() {
        this.computers[0] = new Computer("XPS", "Laptop 16 inch", "Dell");
        this.computers[1] = new Computer("iMac", "Desktop 27 inch", "Apple");
        this.computers[2] = new Computer("Thinkpad", "Laptop 14 inch", "Lenovo");
    }

    public void createPrinters() {
        this.printers[0] = new Printer("Laserjet", "Black and White", "HP");
        this.printers[1] = new Printer("Pixma", "Color", "Canon");
    }

    public void printComputers() {
        System.out.println("Computers:");
        for (Computer computer : this.computers) {
            System.out.println(computer.toString());
        }
        System.out.println();
    }

    public void printPrinters() {
        System.out.println("Printers:");
        for (Printer printer : this.printers) {
            System.out.println(printer.toString());
        }
        System.out.println();
    }

    public void runBazar() {
        initStore(3, 2);
        createComputers();
        createPrinters();
        printComputers();
        printPrinters();
    }
}








