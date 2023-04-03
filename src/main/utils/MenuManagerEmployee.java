package main.utils;

import java.util.Scanner;

public class MenuManagerEmployee implements IMenuManager {
    private static MenuManagerEmployee instance = null;

    private MenuManagerEmployee() {}

    public static MenuManagerEmployee getInstance() {
        if (instance == null) {
            instance = new MenuManagerEmployee();
        }
        return instance;
    }

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
