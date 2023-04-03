package main.utils;

import java.util.Scanner;
/**
 * A menu manager for employees, which implements the IMenuManager interface.

 * It displays a menu with options for creating new computers, printers, and purchases, or exiting the program.

 * @author Xiaowen Zhou

 * @version 1.0

 * @see IMenuManager
 */

public class MenuManagerEmployee implements IMenuManager {
    private static MenuManagerEmployee instance = null;

    private MenuManagerEmployee() {}

    /**
     * Returns the instance of the MenuManagerEmployee class, creating a new instance if one does not already exist.
     * @return the instance of the MenuManagerEmployee class
     */
    public static MenuManagerEmployee getInstance() {
        if (instance == null) {
            instance = new MenuManagerEmployee();
        }
        return instance;
    }
    /**
     * Displays a menu with options for creating new computers, printers, and purchases, or exiting the program.
     * @return the user's selected menu item
     */
    public int menuItem() {
        Scanner sel = new Scanner(System.in);

        System.out.println("1) New Computer");
        System.out.println("2) New Printer");
        System.out.println("3) New Purchase");
        System.out.println("4) Exit");
        System.out.print("Select one:");
        int choice = Integer.parseInt(sel.nextLine());
        System.out.println("Your choice:" + choice);
        return choice;
    }
}
