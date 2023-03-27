import java.util.Scanner;

public class BazarDriver {

    public static void main(String[] args) {
        Store store = new Store();

        // console I/O menu selection
        int selection;
        do {
            selection = MenuInput.menuItem();
            switch (selection) {
                case 1:
                    store.createComputers();
                    break;
                case 2:
                    store.createPrinters();
                    break;
                case 3:
                    store.printComputers();
                    break;
                case 4:
                    store.printPrinters();
                    break;
                case 5:
                    System.out.println("Exiting FIT2099 Digital Bazar.");
                    break;
                default:
                    System.out.println("Invalid selection, please try again.");
                    break;
            }
        } while (selection != 5);
    }

    public static class MenuInput {
        public static int menuItem() { // The static menuItem method is owned by the MenuInput class
            Scanner sel = new Scanner(System.in);

            System.out.println("1) New Computer");
            System.out.println("2) New Printer");
            System.out.println("3) List Computers");
            System.out.println("4) List Printers");
            System.out.println("5) Exit");
            System.out.print("Select one:");
            int choice = Integer.parseInt(sel.nextLine());
            System.out.println("Your choice:"+choice);
            return choice;
        }
    }
}
