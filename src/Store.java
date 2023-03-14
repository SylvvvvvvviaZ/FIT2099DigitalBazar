public class Store {
    private Computer[] computers;
    private Printer[] printers;

    public void initStore(int numComputers, int numPrinters) {
        computers = new Computer[numComputers];
        printers = new Printer[numPrinters];
    }

    public void createComputers() {
        computers[0] = new Computer("XPS", "Laptop 16 inch", "Dell");
        computers[1] = new Computer("iMac", "Desltop 27 inch", "Apple");
        computers[2] = new Computer("Thinkpad", "Laptop 14 inch", "Lenovo");
    }

    public void createPrinters() {
        printers[0] = new Printer("Mono Printer", "Ink_jet Printer", 10);
        printers[1] = new Printer("Multi Function", "Laser Printer", 10);
    }

    public void printComputers() {
        for (Computer computer : computers) {
            System.out.println(computer.toString());
        }
    }

    public void printPrinters() {
        for (Printer printer : printers) {
            System.out.println(printer.toString());
        }
    }

    public void runBazar() {
        initStore(3, 2);
        createComputers();
        createPrinters();
        printComputers();
        printPrinters();
    }
}

