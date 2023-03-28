import main.controllers.PurchaseManager;
import main.controllers.Store;
import main.models.Purchase;
import main.utils.MenuManager;

import java.util.Scanner;

public class BazarDriver {

    public static void main(String[] args) {
        MenuManager menuManager = new MenuManager();
        PurchaseManager purchaseManager = new PurchaseManager();
        Store store = new Store(menuManager, purchaseManager); // pass MenuManager and PurchaseManager to Store constructor

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int option = menuManager.menuItem();

            switch (option) {
                case 1:
                    store.createComputers();
                    break;
                case 2:
                    store.createPrinters();
                    break;
                case 3:
                    Purchase purchase = store.createPurchase();;
                    if (purchase != null) {
                        purchaseManager.makePurchase(store, purchase);
                    }
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
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}