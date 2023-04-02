import main.controllers.PurchaseManager;
import main.controllers.Store;
import main.utils.IMenuManager;
import main.utils.MenuManagerAdmin;

public class BazarDriver {

    public static void main(String[] args) {
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
                    store.createPurchase();;
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
