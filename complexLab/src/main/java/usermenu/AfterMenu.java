package usermenu;

import command.*;
import data.TouristAttractionsData;

import java.io.IOException;
import java.util.HashMap;

import static graphicstext.Graphics.finalMenuText;
import static usermenu.Menu.userChoice;
import static usermenu.SortMenu.sortMenu;

public class AfterMenu {
    public static boolean afterMenu(TouristAttractionsData ticketsDataBase) throws IOException {
        HashMap<Integer, Command> afterMenuCommand = new HashMap<>();
        afterMenuCommand.put(1, new QuizCommand(ticketsDataBase));
        afterMenuCommand.put(2, new ShowAllPorposalsCommand(ticketsDataBase));
        afterMenuCommand.put(3, new LogOutCommand());
        var choice = 0;
        while(choice != 3){
            new GenerateTicketsCommand(ticketsDataBase).execute();
            sortMenu(ticketsDataBase);
            System.out.println(finalMenuText);
            choice = userChoice();
            afterMenuCommand.get(choice).execute();
        }
        return false;
    }
}
