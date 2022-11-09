package usermenu;

import data.TouristAttractionsData;
import data.UserData;

import java.io.IOException;
import java.util.Scanner;

import static usermenu.AfterMenu.afterMenu;
import static usermenu.StartMenu.startMenu;

public class Menu {

    public static int userChoice() {
        Scanner userChoice = new Scanner(System.in);
        System.out.print("Choose action >> ");
        return Integer.parseInt(userChoice.next());
    }

    public static void wholeMenu() throws IOException {
        UserData database = new UserData();
        TouristAttractionsData ticketsDataBase = new TouristAttractionsData();
        startMenu(database);
        if (!afterMenu(ticketsDataBase)){
            wholeMenu();
        }
    }
}