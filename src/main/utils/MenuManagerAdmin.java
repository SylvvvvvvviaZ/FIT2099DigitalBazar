package main.utils;

import java.util.Scanner;

public class MenuManagerAdmin implements IMenuManager {

    private static MenuManagerAdmin instance = null;

    public MenuManagerAdmin() {}

    public static MenuManagerAdmin getInstance() {
        if (instance == null) {
            instance = new MenuManagerAdmin();
        }
        return instance;
    }

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
