package main.utils;

import main.models.purchases.Purchase;

import java.util.Scanner;

/**
 * The MenuManagerAdmin class implements the IMenuManager interface and provides a menu for the administrator.

 * @author Xiaowen Zhou

 * @version 1.0

 * @see IMenuManager
 */
public class MenuManagerAdmin implements IMenuManager {

    private static MenuManagerAdmin instance = null;

    public MenuManagerAdmin() {}

    /**
     * Returns an instance of MenuManagerAdmin.
     * @return The MenuManagerAdmin instance.
     */
    public static MenuManagerAdmin getInstance() {
        if (instance == null) {
            instance = new MenuManagerAdmin();
        }
        return instance;
    }

    /**
     * Displays the menu items and prompts the user for input.
     * @return The selected menu item.
     */
    public int menuItem() {
        Scanner sel = new Scanner(System.in);

        System.out.println("1) New Computer");
        System.out.println("2) New Printer");
        System.out.println("3) New Purchase");
        System.out.println("4) List Computers");
        System.out.println("5) List Printers");
        System.out.println("6) List Purchases");
        System.out.println("7) Exit");
        System.out.print("Select one:");
        int choice = Integer.parseInt(sel.nextLine());
        System.out.println("Your choice:" + choice);
        return choice;
    }
}
