import main.controllers.IData;
import main.controllers.PurchaseManager;
import main.controllers.Store;
import main.utils.IMenuManager;
import main.utils.MenuManagerAdmin;

/**
 * The main driver class for the Bazar program.
 * Creates an instance of the MenuManagerAdmin class to display the main menu options.
 * Creates instance of the PurchaseManager and Store classes to manage purchases and the store's inventory.
 * Handles user input and calls the appropriate methods in the Store and PurchaseManager classes based on the user's selections.
 * @author Xiaowen Zhou
 * @version 1.0
 * @see BazarDriver
 */
public class BazarDriver {

    /**
     * Main driver class for the Bazar program. Displays a menu to the user, accepts user input, and calls the appropriate
     * methods based on the user's selection.
     */
    public static void main(String[] args) throws Exception {
        IMenuManager menuManager = new MenuManagerAdmin();
        PurchaseManager purchaseManager = new PurchaseManager();
        Store store = new Store(menuManager, purchaseManager); // pass MenuManager and PurchaseManager to Store constructor
        int option;
        do {
            option = menuManager.menuItem();

            switch (option) {
                case 1:
                    store.createComputers();
                    break;
                case 2:
                    store.createPrinters();
                    break;
                case 3:
                    store.createPurchase();
                    break;
                case 4:
                    store.printComputers();
                    break;
                case 5:
                    store.printPrinters();
                    break;
                case 6:
                    purchaseManager.printPurchases();
                    break;
                case 7:
                    System.out.println("Exiting program.");
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while(option != 7);
    }
}
